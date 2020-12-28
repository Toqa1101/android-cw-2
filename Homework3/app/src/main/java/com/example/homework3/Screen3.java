package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URI;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        TextView a = findViewById(R.id.nametext);
        TextView b = findViewById(R.id.phonetext);
        TextView c = findViewById(R.id.mailtext);
        TextView d = findViewById(R.id.addtext);

        Bundle bn = getIntent().getExtras();
        a.setText(bn.getString("name"));
        b.setText(bn.getString("phone"));
        c.setText(bn.getString("mail"));
        d.setText(bn.getString("add"));

        ImageView cb = findViewById(R.id.callbtn);
        ImageView mb = findViewById(R.id.mailbtn);
        ImageView ab = findViewById(R.id.addbtn);

        ///////////////////////// call ///////////////////////////
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel: "+bn.getString("phone")));
                startActivity(call);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel: "+bn.getString("phone")));
                startActivity(call);
            }
        });

        ///////////////////////// mail ///////////////////////////

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(Screen3.this, EmailScreen.class);
//                i.putExtra("gmail",b.getText());
//                startActivity(i);

                Intent email = new Intent((Intent.ACTION_SEND));
                email.setType("text/plain");
                startActivity(Intent.createChooser(email,"Send Eameil:"));
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(Screen3.this, EmailScreen.class);
//                i.putExtra("gmail",bn.getString("mail"));
//                startActivity(i);
                Intent email = new Intent((Intent.ACTION_SEND));
                email.setType("text/plain");
                startActivity(Intent.createChooser(email,"Send Eameil:"));
            }
        });

        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri position = Uri.parse("google.streetview:cbll="+d.getText());
                Intent map = new Intent(Intent.ACTION_VIEW,position);
                map.setPackage("com.google.android.apps.maps");
                startActivity(map);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri position = Uri.parse("google.streetview:cbll="+d.getText());
                Intent map = new Intent(Intent.ACTION_VIEW,position);
                map.setPackage("com.google.android.apps.maps");
                startActivity(map);

            }
        });
    }
}