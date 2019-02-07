package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private EditText resultat;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.aTextView);
        b = findViewById(R.id.bTextView);
        resultat = findViewById(R.id.resultatTextView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                // TODO træk a og b ud fra edittext
                String aStringVal  = (a.getText().toString());
                int aIntVal = Integer.parseInt(aStringVal);
                String bStringVal  = (b.getText().toString());
                int bIntVal = Integer.parseInt(bStringVal);

                // TODO  læg dem sammen
                int resultatValue = Calculator.add(aIntVal,bIntVal);
                Log.d("hajmund", "Resultatet er " + resultatValue);

                // TODO  vis det i resultat
                resultat.setText(String.valueOf(resultatValue));

            }
        });
    }




}
