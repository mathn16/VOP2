/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathn16_vop_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import opg1_facade.*;

/**
 *
 * @author Mathias
 */
public class FXMLDocumentController implements Initializable {
    
    private SpecialNumbers sN;
    
    @FXML
    private TextField inputTF;
    
    @FXML
    private TextField outputTF;

    @FXML
    void isEvenEvent(ActionEvent event) {
        if(sN.isEven(Integer.parseInt(inputTF.getText()))) {
            outputTF.setText(inputTF.getText() + " is an even number.");
        }else{
            outputTF.setText(inputTF.getText() + " is an uneven number.");
        }
    }

    @FXML
    void isPowOfTwo(ActionEvent event) {
        if(sN.isPowerOf2(Integer.parseInt(inputTF.getText()))) {
            outputTF.setText(inputTF.getText() + " is power of twos.");
        }else{
            outputTF.setText(inputTF.getText() + " is not power of twos.");
        }
    }

    @FXML
    void isPrimeEvent(ActionEvent event) {
        if(sN.isPrime(Integer.parseInt(inputTF.getText()))) {
            outputTF.setText(inputTF.getText() + " is a prime number.");
        }else{
            outputTF.setText(inputTF.getText() + " is not a prime number.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sN = new SpecialNumbers();
    }    
    
}
