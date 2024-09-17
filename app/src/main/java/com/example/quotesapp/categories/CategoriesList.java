package com.example.quotesapp.categories;

public class CategoriesList {
    private final String categoryName;
    private final int categoryImg;

    public CategoriesList(String categoryName, int categoryImg) {
        this.categoryName = categoryName;
        this.categoryImg = categoryImg;
    }

    public int getCategoryImg() {
        return categoryImg;
    }

    public String getCategoryName() {
        return categoryName;
    }
}