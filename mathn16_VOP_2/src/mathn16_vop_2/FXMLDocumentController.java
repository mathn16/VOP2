/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathn16_vop_2;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import opg1_facade.*;
import opg2_polymorphi.*;

/**
 *
 * @author Mathias
 */
public class FXMLDocumentController implements Initializable {
    
    private SpecialNumbers sN;
    private NumberCheckerFacade nCF;
    private List<Integer> numberList = new LinkedList<>();
    
    @FXML
    private TextField inputTF;

    @FXML
    private TextField outputTF;

    @FXML
    private TextField minTabTwo;

    @FXML
    private TextField maxTabTwo;

    @FXML
    private ToggleGroup selectionTabTwo;

    @FXML
    private TextArea tabTwoTA;

    @FXML
    private RadioButton equalCheck;

    @FXML
    private RadioButton primeCheck;

    @FXML
    private RadioButton powerCheck;
    
    @FXML
    void clearTabTwo(ActionEvent event) {
        tabTwoTA.clear();
        minTabTwo.clear();
        maxTabTwo.clear();
    }

    @FXML
    void checkNumberSelection(ActionEvent event) {
        CheckerInterface cI;
        String appender = "";
        if(event.getSource().equals(equalCheck)) {
            cI = new EvenChecker();
            numberList = nCF.checkNumbers(Integer.parseInt(minTabTwo.getText()), Integer.parseInt(maxTabTwo.getText()), cI);
            for(int i = 0; i < numberList.size(); i++){
                appender += numberList.get(i);
                appender += "Lige tal: af 2: " + numberList.size();
            }
        }else if(event.getSource().equals(primeCheck)){
            cI = new PrimeChecker();
            numberList = nCF.checkNumbers(Integer.parseInt(minTabTwo.getText()), Integer.parseInt(maxTabTwo.getText()), cI);
            for(int i = 0; i < numberList.size(); i++){
                appender += numberList.get(i);
                appender += "Potenser af 2: " + numberList.size();
            }
        }else if(event.getSource().equals(powerCheck)){
            cI = new PowerOf2Checker();
           numberList = nCF.checkNumbers(Integer.parseInt(minTabTwo.getText()), Integer.parseInt(maxTabTwo.getText()), cI);
            for(int i = 0; i < numberList.size(); i++){
                appender += numberList.get(i);
                appender += "Potenser af 2: " + numberList.size();
            }
        }numberList.clear();
        tabTwoTA.setText("[" + appender + "]\n");
    }

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
        nCF = new NumberCheckerFacade();
        outputTF.setEditable(false);
        tabTwoTA.setEditable(false);
        tabTwoTA.setWrapText(true);
    }    
    
}
