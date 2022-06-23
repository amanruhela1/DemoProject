package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText editText1, editText2, editText3;
    Button button;
    TextView textView4;

    double a, b, c, d, x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        button = findViewById(R.id.button);
        textView4 = findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!editText1.getText().toString().equals("")
                        &&!editText2.getText().toString().equals("")
                        &&!editText3.getText().toString().equals("")){

                    a = Double.parseDouble(editText1.getText().toString());
                    b = Double.parseDouble(editText2.getText().toString());
                    c = Double.parseDouble(editText3.getText().toString());

                    d = b * b - 4*a*c;

                    if (d==0){
                        x = -b / (2 * a);
                        textView4.setText("Discriminent = " + d + "\n" + "Roots are equal "+ x + " and " +x);
                    } else if (d<0){
                        textView4.setText("Discriminent = " + d + "\n" + "Roots are imaginary");
                    } else if (d>0){
                        x = (-b + Math.sqrt(d)) / (2 * a);
                        y = (-b - Math.sqrt(d)) / (2 * a);
                        textView4.setText("Discriminent = " + d + "\n" + "Roots are unequal\n"
                                + "Root 1 = "+ x +"\n" + "Root 2 = "+ y);
                    }
                }

            }
        });

    }
}