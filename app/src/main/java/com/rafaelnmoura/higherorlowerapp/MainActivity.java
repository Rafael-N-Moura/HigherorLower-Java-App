package com.rafaelnmoura.higherorlowerapp;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int number;

    public void onClick(View view){
        EditText guessedNumber = (EditText) findViewById(R.id.guessNumberTextEdit);
        int guessedNumberToInt = Integer.parseInt(guessedNumber.getText().toString());

        if(guessedNumberToInt > number){
            Toast.makeText(view.getContext(), "Lower", Toast.LENGTH_SHORT).show();
        }else if(guessedNumberToInt < number){
            Toast.makeText(view.getContext(), "Higher", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(view.getContext(), "You got it, try again with another number", Toast.LENGTH_SHORT).show();
            shuffleNumber();
        }

    }

    public void shuffleNumber(){
        number = new Random().nextInt(21);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        shuffleNumber();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}