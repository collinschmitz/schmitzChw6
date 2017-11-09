package com.example.collin.schmitzchw6;


import java.util.ArrayList;

public class Recipe {
    String name;
    String directions;
    ArrayList<String> tags;
    enum Rating {zero, one, two, three, four, five}
    Rating rating;

    public Recipe(String name, String directions, ArrayList<String> tags, Rating rating){
        this.name = name;
        this.directions = directions;
        this.tags = tags;
        this.rating = rating;
    }

    public String getName()
    {
        return this.name;
    }
    public String getDirections()
    {
        return this.directions;
    }
    public ArrayList<String> getTags()
    {
        return this.tags;
    }
    public Rating getRating(){
        return this.rating;
    }
    public static int getIconResource(Recipe.Rating rating){
        switch (rating){
            case zero: return R.drawable.zero;
            case one: return R.drawable.one;
            case two: return R.drawable.two;
            case three: return R.drawable.three;
            case four: return R.drawable.four;
            case five: return R.drawable.five;
        }
        return -1;
    }
}
