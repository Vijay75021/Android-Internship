package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText name,num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        num=findViewById(R.id.num);
    }

    public void save(View view) {
        String s=name.getText().toString();
        Intent i=new Intent(this,Secondactivity.class);
         i.putExtra("key",s);
        startActivity(i);
    }

    public void dial(View view) {
        String s=num.getText().toString().trim();
        Uri u= Uri.parse("tel:"+s);
        Intent i=new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);
    }
}