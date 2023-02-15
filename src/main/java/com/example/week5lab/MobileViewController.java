package com.example.week5lab;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MobileViewController implements Initializable {

    @FXML
    private ImageView mobileImage;

    @FXML
    private Label mobileLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        MobilePhone phoneOne = new MobilePhone("Nokia 3310", "Nokia3310.png");
        mobileImage.setImage(phoneOne.getImage());
        mobileLabel.setText(phoneOne.getModelName());
    }
}
