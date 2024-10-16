package com.example.pumpkin;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import javax.swing.text.html.ImageView;

public class HelloController {

    public ImageView image1;

    public void innitialize() {
        startRandomEvent();

    }

    private void startRandomEvent() {
        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.millis(Math.random() * 3000),
                        (ActionEvent event) -> {
                            model.randomlyChangeOnePumpkin();
                            startRandomEvent();
                        }
                )
        );
        timeline.play();
    }

    private Model model = new Model();

    public Model getModel() {
        return model;
    }


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