package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {

        Polygon polygon = new Polygon();
        polygon.setTranslateY(0);
        polygon.setTranslateX(-300);
        polygon.getPoints().addAll(
                650.0, 300.0,
                500.0, 150.0,
                350.0, 300.0);
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.RED);

        Polygon polygon1 = new Polygon();
        polygon1.setScaleX(2);
        polygon1.setTranslateY(0);
        polygon1.setTranslateX(300);
        polygon1.getPoints().addAll(
                650.0, 300.0,
                500.0, 150.0,
                350.0, 300.0);
        polygon1.setStroke(Color.BLACK);
        polygon1.setFill(Color.RED);

        Polygon polygon2 = new Polygon();
        polygon2.setScaleY(2);
        polygon2.setTranslateY(500);
        polygon2.setTranslateX(-250);
        polygon2.getPoints().addAll(
                650.0, 300.0,
                500.0, 150.0,
                350.0, 300.0);
        polygon2.setStroke(Color.BLACK);
        polygon2.setFill(Color.RED);

        Polygon polygon3 = new Polygon();
        polygon3.setRotate(75);
        polygon3.setTranslateY(500);
        polygon3.setTranslateX(300);
        polygon3.getPoints().addAll(
                650.0, 300.0,
                500.0, 150.0,
                350.0, 300.0);
        polygon3.setStroke(Color.BLACK);
        polygon3.setFill(Color.RED);

        Group root = new Group(polygon, polygon1, polygon2, polygon3);

        Scene scene = new Scene(root, 1200, 900);

        stage.setTitle("Легкая номер 2(нет не легкая)");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}