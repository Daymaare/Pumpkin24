package com.example.pumpkin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javax.swing.text.html.ImageView;

public class HelloController {

    public ImageView image1;

    public void innitialize() {

    }

    private Model model = new Model();


    public void image1Clicked(MouseEvent mouseEvent) {
        model.pumpkinSmashed(Pumpkin.FIRST);
    }

    public void image2Clicked(MouseEvent mouseEvent) {
        model.pumpkinSmashed(Pumpkin.SECOND);
    }

    public void image3Clicked(MouseEvent mouseEvent) {
        model.pumpkinSmashed(Pumpkin.THIRD);

    }
}