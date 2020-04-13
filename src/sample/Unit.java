package sample;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;

public class Unit {
    private IntegerProperty mVAtZeroDeg;
    private IntegerProperty changingMVPerOneDeg;
    private IntegerProperty minTempFloat;
    private IntegerProperty tempFirstMidPointFloat;
    private IntegerProperty tempSecondMidPointFloat;
    private IntegerProperty maxTempFloat;
    private IntegerProperty minTempBoost;
    private IntegerProperty maxTempBoost;
    private IntegerProperty outputMaximum;
    private IntegerProperty outputMiddle;
    private IntegerProperty outputMinimum;
    private DoubleProperty valueOfNominalCurrentVolt;

    public Unit(){
        this.mVAtZeroDeg.set(500);
        this.changingMVPerOneDeg.set(10);
        this.minTempFloat.set(0);
        this.tempFirstMidPointFloat.set(15);
        this.tempSecondMidPointFloat.set(35);
        this.maxTempFloat.set(50);
        this.maxTempBoost.set(30);
        this.minTempBoost.set(45);
        this.outputMaximum.set(2660);
        this.outputMiddle.set(2550);
        this.outputMinimum.set(2468);
        this.valueOfNominalCurrentVolt.set(30.0);


    }

    public int getmVAtZeroDeg() {
        return mVAtZeroDeg.get();
    }

    public IntegerProperty mVAtZeroDegProperty() {
        return mVAtZeroDeg;
    }

    public void setmVAtZeroDeg(int mVAtZeroDeg) {
        this.mVAtZeroDeg.set(mVAtZeroDeg);
    }

    public int getChangingMVPerOneDeg() {
        return changingMVPerOneDeg.get();
    }

    public IntegerProperty changingMVPerOneDegProperty() {
        return changingMVPerOneDeg;
    }

    public void setChangingMVPerOneDeg(int changingMVPerOneDeg) {
        this.changingMVPerOneDeg.set(changingMVPerOneDeg);
    }

    public int getMinTempFloat() {
        return minTempFloat.get();
    }

    public IntegerProperty minTempFloatProperty() {
        return minTempFloat;
    }

    public void setMinTempFloat(int minTempFloat) {
        this.minTempFloat.set(minTempFloat);
    }

    public int getTempFirstMidPointFloat() {
        return tempFirstMidPointFloat.get();
    }

    public IntegerProperty tempFirstMidPointFloatProperty() {
        return tempFirstMidPointFloat;
    }

    public void setTempFirstMidPointFloat(int tempFirstMidPointFloat) {
        this.tempFirstMidPointFloat.set(tempFirstMidPointFloat);
    }

    public int getTempSecondMidPointFloat() {
        return tempSecondMidPointFloat.get();
    }

    public IntegerProperty tempSecondMidPointFloatProperty() {
        return tempSecondMidPointFloat;
    }

    public void setTempSecondMidPointFloat(int tempSecondMidPointFloat) {
        this.tempSecondMidPointFloat.set(tempSecondMidPointFloat);
    }

    public int getMaxTempFloat() {
        return maxTempFloat.get();
    }

    public IntegerProperty maxTempFloatProperty() {
        return maxTempFloat;
    }

    public void setMaxTempFloat(int maxTempFloat) {
        this.maxTempFloat.set(maxTempFloat);
    }

    public int getMinTempBoost() {
        return minTempBoost.get();
    }

    public IntegerProperty minTempBoostProperty() {
        return minTempBoost;
    }

    public void setMinTempBoost(int minTempBoost) {
        this.minTempBoost.set(minTempBoost);
    }

    public int getMaxTempBoost() {
        return maxTempBoost.get();
    }

    public IntegerProperty maxTempBoostProperty() {
        return maxTempBoost;
    }

    public void setMaxTempBoost(int maxTempBoost) {
        this.maxTempBoost.set(maxTempBoost);
    }

    public int getOutputMaximum() {
        return outputMaximum.get();
    }

    public IntegerProperty outputMaximumProperty() {
        return outputMaximum;
    }

    public void setOutputMaximum(int outputMaximum) {
        this.outputMaximum.set(outputMaximum);
    }

    public int getOutputMiddle() {
        return outputMiddle.get();
    }

    public IntegerProperty outputMiddleProperty() {
        return outputMiddle;
    }

    public void setOutputMiddle(int outputMiddle) {
        this.outputMiddle.set(outputMiddle);
    }

    public int getOutputMinimum() {
        return outputMinimum.get();
    }

    public IntegerProperty outputMinimumProperty() {
        return outputMinimum;
    }

    public void setOutputMinimum(int outputMinimum) {
        this.outputMinimum.set(outputMinimum);
    }

    public double getValueOfNominalCurrentVolt() {
        return valueOfNominalCurrentVolt.get();
    }

    public DoubleProperty valueOfNominalCurrentVoltProperty() {
        return valueOfNominalCurrentVolt;
    }

    public void setValueOfNominalCurrentVolt(double valueOfNominalCurrentVolt) {
        this.valueOfNominalCurrentVolt.set(valueOfNominalCurrentVolt);
    }
}
