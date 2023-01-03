/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author admin
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
private TextField heightField;
    @FXML
private TextField weightField;
    @FXML
private TextField nameField;
    @FXML
private Label labelDisplay;

    
    @FXML
private void getBmi(ActionEvent event) {
int height = Integer.parseInt(heightField.getText());
int weight = Integer.parseInt(weightField.getText());
String info = String.format("BMI:%.2f", weight / Math.pow(height / 100.0, 2));
labelDisplay.setText(info);
}

@FXML
private void sayHello(ActionEvent event) {
String name = nameField.getText();
labelDisplay.setText("歡迎:" + name);
}

    @FXML
private void calculate(ActionEvent event) {
int height = Integer.parseInt(heightField.getText());
labelDisplay.setText("身高:" + height / 100.0 + "公尺");
}

   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
