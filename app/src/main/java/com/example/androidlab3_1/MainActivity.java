package com.example.androidlab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView tv;
    private RadioButton rbOne,rbTwo,rbThree,rbFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
        tv= (TextView) findViewById(R.id.tv);
        rbOne= (RadioButton)findViewById(R.id.rbOne);
        rbTwo= (RadioButton)findViewById(R.id.rbTwo);
        rbThree= (RadioButton)findViewById(R.id.rbThree);
        rbFour= (RadioButton)findViewById(R.id.rbFour);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbOne.isChecked()){
                    tv.setText("Your grade is 1");
                }else if(rbTwo.isChecked()){
                    tv.setText("Your grade is 2");
                }else if(rbThree.isChecked()){
                    tv.setText("Your grade is 3");
                }else if(rbFour.isChecked()){
                    tv.setText("Your grade is 4");
                }
            }
        });
    }
}