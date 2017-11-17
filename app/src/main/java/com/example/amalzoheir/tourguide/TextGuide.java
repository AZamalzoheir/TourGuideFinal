package com.example.amalzoheir.tourguide;

/**
 * Created by Amalzoheir on 11/13/2017.
 */

public class TextGuide {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String name;
    private String description;
    private int scourceNumberImage = NO_IMAGE_PROVIDED;
    private int scourceNumberVidio;

    public TextGuide(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TextGuide(String name, String description, int scourceNumberImage) {
        this.name = name;
        this.description = description;
        this.scourceNumberImage = scourceNumberImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getScourceNumberImage() {
        return scourceNumberImage;
    }

    public void setScourceNumberImage(int scourceNumberImage) {
        this.scourceNumberImage = scourceNumberImage;
    }

    public boolean hasImage() {
        return scourceNumberImage != NO_IMAGE_PROVIDED;
    }
}
