package com.example.pumpkin;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.image.Image;


public class Model {

    private int score = 0;
    Image noSmash;
    Image smash;

    public Image getFirstPumpkin() {
        return firstPumpkin.get();
    }

    public ObjectProperty<Image> firstPumpkinProperty() {
        return firstPumpkin;
    }

    public void setFirstPumpkin(Image firstPumpkin) {
        this.firstPumpkin.set(firstPumpkin);
    }

    public Image getSecondPumpkin() {
        return secondPumpkin.get();
    }

    public ObjectProperty<Image> secondPumpkinProperty() {
        return secondPumpkin;
    }

    public void setSecondPumpkin(Image secondPumpkin) {
        this.secondPumpkin.set(secondPumpkin);
    }

    public Image getThirdPumpkin() {
        return thirdPumpkin.get();
    }

    public ObjectProperty<Image> thirdPumpkinProperty() {
        return thirdPumpkin;
    }

    public void setThirdPumpkin(Image thirdPumpkin) {
        this.thirdPumpkin.set(thirdPumpkin);
    }

    ObjectProperty<Image> firstPumpkin;
    ObjectProperty<Image> secondPumpkin;
    ObjectProperty<Image> thirdPumpkin;

    public Model() {
        noSmash = new Image(getClass().getResource("images/pumpkin_blank.png").toExternalForm());
        smash = new Image(getClass().getResource("images/pumpkin1.png").toExternalForm());

        firstPumpkin = new SimpleObjectProperty<>(smash);
        secondPumpkin = new SimpleObjectProperty<>(noSmash);
        thirdPumpkin = new SimpleObjectProperty<>(noSmash);


    }

    public void pumpkinSmashed(Pumpkin pumpkin) {
        //Check if we can smack this pumpkin
        //Increase score


        score += 10;
        System.out.println(getScore());
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


