package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int min=1;
    final int max=20;
    int m;
    EditText editText;
    Button button;

    public void generate_randomNumber(){
        Random rand=new Random();
        m=rand.nextInt(20)+1;
    }

    public void guess(View view){
        editText=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);
        int n=Integer.parseInt(editText.getText().toString());
        if(m>n){
            Toast.makeText(this, "GO HIGHER", Toast.LENGTH_SHORT).show();
        }
        else if(m==n){
            Toast.makeText(this, "U GUESSED THE NUMBER", Toast.LENGTH_SHORT).show();
            generate_randomNumber();
        }
        else{
            Toast.makeText(this, "GO LOWER", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate_randomNumber();
    }
}