package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView3);
        editText = findViewById(R.id.editTextText2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hi you click button", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                System.out.println(s);
//                int Kg = Integer.parseInt(s);
//                System.out.println(Kg);
//                double pound = 2.20462 * Kg;
//                textView.setText("The corresponding value of kg into pound " + pound);
//            }
//        });
    }
    // by method we adding this method in onclick property of button when we
    // we press it get call
        public void calculate(View view ){
            String s=editText.getText().toString();
            System.out.println(s);
            int Kg=Integer.parseInt(s);
            System.out.println(Kg);
            double pound=2.20462*Kg;
            DecimalFormat df = new DecimalFormat("#.##");
            String formattedPound = df.format(pound);

            textView.setText("The corresponding value of kg into pound " + formattedPound);


    }
}