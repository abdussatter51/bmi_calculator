package com.abdussatter.bmicalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edFeet, edInch, edWeight;
    Button btnCalculateBMI;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_main);

        edFeet = findViewById(R.id.edFeet);
        edInch = findViewById(R.id.edInch);
        edWeight = findViewById(R.id.edWeight);
        btnCalculateBMI = findViewById(R.id.btnCalculateBMI);
        tvResult = findViewById(R.id.tvResult);

        btnCalculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float feet = Float.parseFloat(edFeet.getText().toString());
                float inch = Float.parseFloat(edInch.getText().toString());
                float weight = Float.parseFloat(edWeight.getText().toString());
                float height = (float) (feet*0.3048+inch*0.0254);
                float bmi = weight/height/height;
                tvResult.setText(""+bmi);
            }
        });




    }
}