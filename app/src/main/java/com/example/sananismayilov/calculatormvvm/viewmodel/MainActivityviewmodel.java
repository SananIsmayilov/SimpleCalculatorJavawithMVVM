package com.example.sananismayilov.calculatormvvm.viewmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityviewmodel extends ViewModel {
    private  String yekun ;

    public String getYekun() {
        return yekun;
    }

    public void topla(String number1, String number2){
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        yekun = String.valueOf("Nəticə : " +(num1+num2));
    }
    public void cix(String number1,String number2){
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        yekun = String.valueOf("Nəticə : " +(num1-num2));
    }
    public void vur(String number1,String number2){
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        yekun = String.valueOf("Nəticə : " +(num1*num2));
    }
    public void bol(String number1,String number2){
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        yekun = String.valueOf("Nəticə : " + (num1/num2));
    }
}
