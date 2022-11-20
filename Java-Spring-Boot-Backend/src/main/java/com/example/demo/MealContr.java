package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealContr {

@Autowired
MealRep mealRep;

@GetMapping("/getAllMeals")
public List<Meals> getAllMeals()
{
return mealRep.findAll();
}

@GetMapping("/getMealsById/{id}")
public Optional<Meals> getMealsById(@PathVariable(value="id") Long id)
{
return mealRep.findById(id);
}

@PostMapping("/addMeals")
public Meals addMeals(@RequestBody Meals Meals)
{
return mealRep.save(Meals);
}

@PutMapping("/updateMeals/{id}")
public Meals updateMeals(@PathVariable(value="id") Long id, @RequestBody Meals mealsDto)
{
Optional<Meals> meals = mealRep.findById(id);
Meals book_new=meals.get();
book_new.setStrMeal(mealsDto.getStrMeal());
book_new.setstrMealThumb(mealsDto.getstrMealThumb());
return mealRep.save(book_new);

}

@DeleteMapping("/deleteMeals/{id}")
public void deleteMeals(@PathVariable(value="id") Long id)
{
Optional<Meals> Meals=mealRep.findById(id);
Meals book_new=Meals.get();
mealRep.delete(book_new);
}

}