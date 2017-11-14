package com.example.amalzoheir.tourguide;

/**
 * Created by Amalzoheir on 11/13/2017.
 */

public class TextGuide {
    private String name;
    private String description;
    public TextGuide(String name,String description){
        this.name=name;
        this.description=description;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}
