package com.example.objectprint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {

    public static void main(String[] args) {
        Person person = new Person("Juan", 30);
        System.out.println(person);
    }
}