package com.example.week5lab;

import javafx.scene.image.Image;

public class MobilePhone {

    // variable init
    private String modelName;
    private String imagePath;

    public MobilePhone(String modelName, String imagePath) {
        setModelName(modelName);
        setImagePath(imagePath);
    }

    // functions
    public Image getImage() {
        String fileName = "images/" + imagePath;
        return new Image(MobilePhone.class.getResourceAsStream(fileName));
    }

    public String getModelName() {
        return modelName;
    }

    private void setModelName(String modelName) {
        if(!modelName.isBlank()) {
            this.modelName = modelName;
        } else {
            throw new IllegalArgumentException("Model name cannot be blank. Please set a usable model name.");
        }
    }

    private void setImagePath(String imagePath) {
        // gotta get both those file extensions man
        // no webp tho >:(
        if(!imagePath.isBlank() && (imagePath.endsWith(".png") || imagePath.endsWith(".jpeg"))) {
            this.imagePath = imagePath;
        } else {
            throw new IllegalArgumentException("File not found or does not exist. Given path must end in image file (.png or .jpeg)");
        }
    }
}
