package com.dicoding.javafundamental.collection;

public class Planet {
    private String name;
    private double mass;

    public Planet(String name, double mass){
        this.name = name;
        this.mass = mass;
    }

    public String toString(){
        return "Planet " + this.name + ", mass: " + this.mass;
    }

}
