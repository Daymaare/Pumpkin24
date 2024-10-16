package com.example.pumpkin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {

    HelloController() {
        textLabel.textProperty().bind(model.userTextProperty());
    }

    public void Initialize() {
        textLabel.textProperty().bind(model.userTextProperty());
        textFieldTarget.textProperty().bind(model.userTextProperty());
    }

    public Model model = new Model();

    public Button transferButton;
    public TextField textField;
    public Label textLabel;
    public TextField textFieldTarget;

    public Model getModel() {
        return model;
    }

    @FXML
    protected void transferButtonAction() {
        model.setUserText(textField.getText());

        textFieldTarget.setText(model.getUserText());
        textLabel.setText(model.getUserText());
    }

    public void textFieldChanged(KeyEvent inputMethodEvent) {
        transferButton.setDisable(textField.getText().isEmpty());

    }
}