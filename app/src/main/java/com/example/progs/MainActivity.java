package com.example.progs;

import android.service.autofill.Validator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//a12313
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button inBtn,uythbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button2){}

    }
}