package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/details")
public class DetailsContr {

    @Autowired
    private DetailsRep detailsRepository;


    @GetMapping(path = "/help")
    public ResponseEntity<Object> help() {
        RestTemplate rt = new RestTemplate();
        for (int i = 52764; i < 52789; i++) {
            ResponseEntity<ApiResponse> response = rt.getForEntity("https://www.themealdb.com/api/json/v1/1/lookup.php?i=" + String.valueOf(i),
                    ApiResponse.class);

            if (response.getStatusCode().equals(HttpStatus.OK)) {
                if (response.getBody().getMeals() != null && response.getBody().getMeals().size() > 0) {
                    Details details = response.getBody().getMeals().get(0);
                    detailsRepository.save(details);
                }
            }
        }

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> getDetailsById(@PathVariable String id) {
        Optional<Details> detailsOptional = detailsRepository.findById(id);

        List<Details> resultArray;
        if (!detailsOptional.isPresent()) {
            resultArray = null;
        } else {
            resultArray = new ArrayList<>();
            resultArray.add(detailsOptional.get());
        }

        HashMap<String, Object> meal = new HashMap<>();
        meal.put("meal", resultArray);

        return new ResponseEntity<>(meal, HttpStatus.OK);
    }

}
