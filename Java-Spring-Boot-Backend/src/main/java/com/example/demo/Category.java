package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
@Id
private Long idCategory;
@Column
private String strCategory;
@Column
private String strCategoryThumb;
@Column
private String strCategoryDescription;

public Category(){ }

public Category(Long idCategory, String strCategory, String strCategoryThumb, String strCategoryDescription) {
this.idCategory=idCategory;
this.strCategory=strCategory;
this.strCategoryThumb=strCategoryThumb;
this.strCategoryDescription=strCategoryDescription;
}

public Long getIdCategory() {
return idCategory;
}

public void setIdCategory(Long idCategory) {
this.idCategory = idCategory;
}

public String getStrCategory() {
return strCategory;
}

public void setStrCategory(String strCategory) {
this.strCategory = strCategory;
}

public String getstrCategoryThumb() {
return strCategoryThumb;
}

public void setstrCategoryThumb(String strCategoryThumb) {
this.strCategoryThumb = strCategoryThumb;
}

public String getstrCategoryDescription() {
return strCategoryDescription;
}

public void setstrCategoryDescription(String strCategoryDescription) {
this.strCategoryDescription = strCategoryDescription;
}

}