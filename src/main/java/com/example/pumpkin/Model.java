package com.example.pumpkin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public class Model {
    private StringProperty userText = new SimpleStringProperty();

    public void setUserText(String userText){
        this.userText.set(userText);
    }

    public String getUserText(){
        return userText.get();
    }

    public ObservableValue<String> userTextProperty() {
        return userText;
    }
}
