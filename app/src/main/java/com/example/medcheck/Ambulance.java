package com.example.medcheck;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Spinner;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class Ambulance extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String num="";
    String[] States={"Select","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka"
    ,"Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura"
    ,"Uttar Pradesh","Uttarakhand","West Bengal"};
    String[] Phone={"0","108","102","108","1911","102","102","108","108","108","108","102","108","108","108","102","108","102","102","108","108","108","102"
    ,"102","108","108","108","108","102"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambulance);


        // TextView tv = (TextView)findViewById(R.id.resulttv);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);


        //Creating the ArrayAdapter instance having the bank name list

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, States);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), States[position], Toast.LENGTH_LONG).show();
        num=Phone[position];
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }


    public void call(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);

        i.setData(Uri.parse("tel:"+num));

        startActivity(i);
    }
}