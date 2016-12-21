package com.example.manasa_pt1119.calculator;

import android.view.View;

/**
 * Created by manasa-pt1119 on 21/12/16.
 */

public class CalcPresenter {

    private ITalkToView iTalkToView;
    View v;

    CalcPresenter(ITalkToView iTalkToView){
        this.iTalkToView = iTalkToView;
    }

    public void add(double a, double b){
        double k = a+b;
        iTalkToView.publishResult(k);
    }
    public void sub(double a, double b){
        double k = a-b;
        iTalkToView.publishResult(k);
    }
    public void mul(double a, double b){
        double k = a*b;
        iTalkToView.publishResult(k);
    }
    public void div(double a, double b){
        double k = a/b;
        iTalkToView.publishResult(k);
    }
    public void show()
    {
        iTalkToView.updateDisplay();
    }
}
