package com.example.medcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Home extends AppCompatActivity {
    Intent intent1,intent2,intent3,intent4,intent5,intent6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void pharmacology(View view) {
        Intent intent1=new Intent(this, Pharma.class);
        Log.d("pharmacology","entered method");
        startActivity(intent1);
    }


    public void diagnostic(View view) {
        Intent intent2 = new Intent(this, Diagnosis.class);
        startActivity(intent2);
    }

    public void report(View view) {
        Intent intent3 = new Intent(this, Symptoms.class);
        startActivity(intent3);
    }

    public void doctor(View view) {
        Intent intent4 = new Intent(this, Healthtips.class);
        startActivity(intent4);
    }

    public void hospital(View view) {
        Intent intent5 = new Intent(this, Hospital.class);
        startActivity(intent5);
    }

    public void ambulance(View view) {
        Intent intent6 = new Intent(this, Ambulance.class);
        startActivity(intent6);
    }



}