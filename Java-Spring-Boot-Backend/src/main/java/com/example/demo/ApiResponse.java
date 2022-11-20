package com.example.demo;

import java.util.List;

public class ApiResponse {
    private List<Details> meals;

    public List<Details> getMeals() {
        return meals;
    }

    public void setMeals(List<Details> meals) {
        this.meals = meals;
    }
}
