package com.example.calcapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonAdd;
    Button buttonSubtr;
    Button buttonMul;
    Button buttonDiv;
    EditText FirstArg;
    EditText SecondArg;
    TextView RezultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.add);
        buttonSubtr = findViewById(R.id.subtr);
        buttonMul = findViewById(R.id.mul);
        buttonDiv = findViewById(R.id.divide);
        FirstArg = findViewById(R.id.arg1);
        SecondArg = findViewById(R.id.arg2);
        RezultView = findViewById(R.id.answer);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int FirstTerm = Integer.parseInt(FirstArg.getText().toString());
                    int SecondTerm = Integer.parseInt(SecondArg.getText().toString());
                    String Sum = String.valueOf(FirstTerm+SecondTerm);
                    RezultView.setText(Sum);
                }catch (NumberFormatException e){
                    RezultView.setText("Input Error");
                }
            }
        });
        buttonSubtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int minuend = Integer.parseInt(FirstArg.getText().toString());
                    int Subtrahend = Integer.parseInt(SecondArg.getText().toString());
                    String diff = String.valueOf(minuend-Subtrahend);
                    RezultView.setText(diff);
                }catch (NumberFormatException e){
                    RezultView.setText("Input Error");
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int FirstFactor = Integer.parseInt(FirstArg.getText().toString());
                    int SecondFactor = Integer.parseInt(SecondArg.getText().toString());
                    String work = String.valueOf(FirstFactor*SecondFactor);
                    RezultView.setText(work);
                }catch (NumberFormatException e){
                    RezultView.setText("Input Error");
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int devidend = Integer.parseInt(FirstArg.getText().toString());
                    int devider = Integer.parseInt(SecondArg.getText().toString());
                    String priv = String.valueOf(devidend/devider);
                    RezultView.setText(priv);
                } catch (NumberFormatException e){
                    RezultView.setText("Input Error");
                } catch (ArithmeticException e){
                    RezultView.setText("Div by zero");
                }
            }
        });
    }
}
