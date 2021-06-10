package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button toast,count,decreasecount;
TextView tv;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast=findViewById(R.id.toast);
        count=findViewById(R.id.count);
        tv=findViewById(R.id.tv);
        decreasecount=findViewById(R.id.decreasecount);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                tv.setText(String.valueOf(i));
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "WELCOME TO ANDROID.YOUR COUNT IS "+i, Toast.LENGTH_SHORT).show();
            }
        });
        decreasecount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>0){
                    i--;
                }else{
                    i=0;
                }
                tv.setText(String.valueOf(i));
            }
        });
    }
}