package com.dht.bmiapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Label lblResult;
    
    public void bmiHandler(ActionEvent evt) {
        double height = Double.parseDouble(this.txtHeight.getText());
        double weight = Double.parseDouble(this.txtWeight.getText());
        double bmi = weight / Math.pow(height, 2);
        
        this.lblResult.setText("Gia tri = " + bmi);
    }
}
