/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author admin
 */
public class FXMLDocumentController implements Initializable {
    
    int ans=(int)(Math.random()*1000);
    int low=0;
    int high=1000;
    @FXML
    private TextField numberField;
    @FXML
    private Label rangeText;
    @FXML
    private Label answer;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void guess(ActionEvent event) {
        int number=Integer.parseInt(numberField.getText());
        String display;
        if(number<ans)
        {
            low=number;
        }
        else if(number==ans)
        {
            answer.setText("答對了");
        }
        else if(number>ans)
        {
            high=number;
        }
        display=String.format("請輸入數字(%d~%d):",low,high);
        rangeText.setText(display);
        
        
        
        
        
        
        
        
        
    }
    
}
