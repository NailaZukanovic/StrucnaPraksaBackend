package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Meals")
public class Meals {
@Id
private Long idMeal;
@Column
private String strMeal;
@Column
private String strMealThumb;

public Meals(){ }

public Meals(Long idMeal, String strMeal, String strMealThumb) {
this.idMeal=idMeal;
this.strMeal=strMeal;
this.strMealThumb=strMealThumb;
}

public Long getIdMeal() {
return idMeal;
}

public void setIdMeal(Long idMeal) {
this.idMeal = idMeal;
}

public String getStrMeal() {
return strMeal;
}

public void setStrMeal(String strMeal) {
this.strMeal = strMeal;
}

public String getstrMealThumb() {
return strMealThumb;
}

public void setstrMealThumb(String strMealThumb) {
this.strMealThumb = strMealThumb;
}

}