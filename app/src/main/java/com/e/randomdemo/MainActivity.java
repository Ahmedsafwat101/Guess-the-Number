package com.e.randomdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void Guess(View view )
    {


        EditText guessedittext= (EditText)findViewById(R.id.guesstxt);
        //Toast.makeText(MainActivity.this,guessedittext.getText().toString(),Toast.LENGTH_LONG).show();
        if(randomNumber== Integer.parseInt(guessedittext.getText().toString()))
        {
            Toast.makeText(MainActivity.this,"Correct! Try Again",Toast.LENGTH_SHORT).show();
            Random rand= new Random();
            randomNumber=rand.nextInt(20)+1;
        }
        else if(randomNumber> Integer.parseInt(guessedittext.getText().toString()))
        {
            Toast.makeText(MainActivity.this,"Higher",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Lower",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
       randomNumber= rand.nextInt(20)+1;
    }
}
