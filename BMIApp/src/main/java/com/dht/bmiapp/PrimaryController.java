package com.dht.bmiapp;

import com.dht.service.BmiService;
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
        
        BmiService b = new BmiService(height, weight);
        
        if (b.getLabel() == 0)
            this.lblResult.setText("Bình thường");
        else
            this.lblResult.setText("Béo phì");
    }
}
