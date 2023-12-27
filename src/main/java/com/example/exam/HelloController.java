package com.example.exam;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button infoPageBtn;

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private AnchorPane pagesAnchorPane;

    @FXML
    private Button tableViewPageBtn;

    @FXML
    private Button userPageBtn;

    @FXML
    void infoPageBtnClick(ActionEvent event) {
        try {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("info-page-view.fxml"));
            pagesAnchorPane.getChildren().setAll(anchorPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void tableViewPageBtnClick(ActionEvent event) {
        try {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("table-page-view.fxml"));
            pagesAnchorPane.getChildren().setAll(anchorPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void userPageBtnClick(ActionEvent event) {
        try {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("user-page-view.fxml"));
            pagesAnchorPane.getChildren().setAll(anchorPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}