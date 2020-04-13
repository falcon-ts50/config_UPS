package sample;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField mVAtZeroDeg;

    @FXML
    private TextField changingMVPerOneDeg;

    @FXML
    private TextField minTempFloat;

    @FXML
    private TextField tempFirstMidPointFloat;

    @FXML
    private TextField tempSecondMidPointFloat;

    @FXML
    private TextField maxTempFloat;

    @FXML
    private TextField minTempBoost;

    @FXML
    private TextField maxTempBoost;

    @FXML
    private TextField outputMaximum;

    @FXML
    private TextField outputMiddle;

    @FXML
    private TextField outputMinimum;

    @FXML
    private TextField valueOfNominalCurrentVolt;

    @FXML
    private Button previousField;

    @FXML
    private Button clear;

    @FXML
    private Button write;

    private Main main;

    public void setMain(Main main){
        this.main=main;
    }

}
