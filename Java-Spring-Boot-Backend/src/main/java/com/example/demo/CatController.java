package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CatController {

@Autowired
CatRep catRep;

@GetMapping("/getAllCategories")
public List<Category> getAllCategories()
{
return catRep.findAll();
}

@GetMapping("/getCategoryById/{id}")
public Optional<Category> getCategoryById(@PathVariable(value="id") Long id)
{
return catRep.findById(id);
}

@PostMapping("/addCategory")
public Category addCategory(@RequestBody Category category)
{
return catRep.save(category);
}

@PutMapping("/updateCategory/{id}")
public Category updateCategory(@PathVariable(value="id") Long id, @RequestBody Category category)
{
Optional<Category> cat = catRep.findById(id);
Category catNew=cat.get();
catNew.setStrCategory(category.getStrCategory());
catNew.setstrCategoryThumb(category.getstrCategoryThumb());
catNew.setstrCategoryDescription(category.getstrCategoryDescription());
return catRep.save(catNew);

}

@DeleteMapping("/deleteCategory/{id}")
public void deleteCategory(@PathVariable(value="id") Long id)
{
Optional<Category> category=catRep.findById(id);
Category book_new=category.get();
catRep.delete(book_new);
}

}