/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week16;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import javafx.scene.control.TextArea;

/**
 *
 * @author admin
 */
public class FXMLDocumentController implements Initializable {

    String Order = "";
    int totalprice=0;
    @FXML
    private CheckBox Main1;
    @FXML
    private CheckBox Main2;
    @FXML
    private CheckBox Main3;
    @FXML
    private TextArea display;
    @FXML
    private CheckBox Sub1;
    @FXML
    private CheckBox Sub2;
    @FXML
    private CheckBox Sub3;
    @FXML
    private Button pay;
    @FXML
    private Button buttonClear;

  

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void order(ActionEvent event) {
        if (Main1.isSelected()) {
            Order = Order + Main1.getText()+"\n";
            totalprice=totalprice+60;
        } if (Main2.isSelected()) {
            Order = Order + Main2.getText()+"\n";
            totalprice=totalprice+65;
        }if (Main3.isSelected()) {
            Order = Order + Main3.getText()+"\n";
            totalprice=totalprice+40;
        } if (Sub1.isSelected()) {
            Order = Order + Sub1.getText()+"\n";
            totalprice=totalprice+10;
        } if (Sub2.isSelected()) {
            Order = Order + Sub2.getText()+"\n";
            totalprice=totalprice+10;
        } if (Sub3.isSelected()) {
            Order = Order + Sub3.getText()+"\n";
            totalprice=totalprice+10;
        }
        Order=Order+"總共:"+totalprice+"元"+"\n";
        display.appendText(Order);
        totalprice=0;
        Order="";
        

    }
    @FXML
     private void clearOrder(ActionEvent event) {
        
       
        display.setText(Order);
        totalprice=0;
        Order="";
        

    }

}
