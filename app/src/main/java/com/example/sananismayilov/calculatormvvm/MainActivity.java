package com.example.sananismayilov.calculatormvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.example.sananismayilov.calculatormvvm.databinding.ActivityMainBinding;
import com.example.sananismayilov.calculatormvvm.viewmodel.MainActivityviewmodel;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    MainActivityviewmodel mainActivityviewmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setContentView(binding.getRoot());

        mainActivityviewmodel = new  ViewModelProvider(this).get(MainActivityviewmodel.class);

        binding.setYekun("0");
        binding.setMainActivityObjects(this);
    }

    public void topla(String number1,String number2){
        if(!number1.equals("") && !number2.equals("")){
            mainActivityviewmodel.topla(number1,number2);
            binding.setYekun(mainActivityviewmodel.getYekun());
        }

    }
    public void cix(String number1,String number2){
        if(!number1.equals("") && !number2.equals("")){
            mainActivityviewmodel.cix(number1,number2);
            binding.setYekun(mainActivityviewmodel.getYekun());
        }
    }
    public void vur(String number1,String number2){
        if(!number1.equals("") && !number2.equals("")){
            mainActivityviewmodel.vur(number1,number2);
            binding.setYekun(mainActivityviewmodel.getYekun());
        }
    }
    public void bol(String number1,String number2){
        if(!number1.equals("") && !number2.equals("")){
            mainActivityviewmodel.bol(number1,number2);
            binding.setYekun(mainActivityviewmodel.getYekun());
        }
    }
}