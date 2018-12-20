package com.soialab.askaruly.readcsvexample_android;

import java.util.zip.DeflaterOutputStream;

/**
 * Created by iptea on 5/21/2018.
 */

public class FoodSample {


    private String name;
    private double Carbohydrate;
    private double Fat;
    private double Protein;
    private double Calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCarbohydrate() {
        return Carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        Carbohydrate = carbohydrate;
    }

    public double getFat() {
        return Fat;
    }

    public void setFat(double fat) {
        Fat = fat;
    }

    public double getProtein() {
        return Protein;
    }

    public void setProtein(double protein) {
        Protein = protein;
    }

    public double getCalories() {
        return Calories;
    }

    public void setCalories(double calories) {
        Calories = calories;
    }

    @Override
    public String toString() {
        return "FoodSample{" +
                "name='" + name + '\'' +
                ", Carbohydrate=" + Carbohydrate +
                ", Fat=" + Fat +
                ", Protein=" + Protein +
                ", Calories=" + Calories +
                '}';
    }
}