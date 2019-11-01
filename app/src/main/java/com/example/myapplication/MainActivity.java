package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private TextView fahrenheit;
    private Button calculation;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculation=(Button)findViewById(R.id.calculation);
        input = (EditText)findViewById(R.id.input);
        calculation = (Button)findViewById(R.id.calculation);
        fahrenheit= (TextView)findViewById(R.id.fahrenheit);

        calculation.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                String[] account = {"轉換為攝氏"};
                for (int i = 0; i < account.length; i++) {
                    if (!calculation.getText().toString().equals(account[i])) {
                        calculation.setText("轉換為攝氏");
                        fahrenheit.setText("華氏溫度:");
                        float fh = Float.parseFloat(input.getEditableText().toString());
                        float fresult;
                        TextView result = (TextView)findViewById(R.id.output);
                        fh = fh*9/5+32;


                        NumberFormat nf = NumberFormat.getInstance();
                        nf.setMaximumFractionDigits(2);
                        fresult = fh;
                        result.setText(nf.format(fh) +"°F");



                    }
                    else {
                        calculation.setText("轉換為華氏溫度");
                        fahrenheit.setText("攝氏溫度:");
                        float fh = Float.parseFloat(input.getEditableText().toString());
                        float fresult;
                        TextView result = (TextView)findViewById(R.id.output);
                        fh = fh;


                        NumberFormat nf = NumberFormat.getInstance();
                        nf.setMaximumFractionDigits(2);
                        fresult = fh;
                        result.setText(nf.format(fh) +"°C");


                    }
                }
            }
        });
    }
}