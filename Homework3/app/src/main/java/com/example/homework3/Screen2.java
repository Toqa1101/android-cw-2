package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        EditText a = findViewById(R.id.name);
        EditText b = findViewById(R.id.phone);
        EditText c = findViewById(R.id.mail);
        EditText d = findViewById(R.id.add);

        ImageView done = findViewById(R.id.done);
       // Button btn = findViewById(R.id.button);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Screen2.this, Screen3.class);
                String aa= a.getText().toString();
                String bb= b.getText().toString();
                String cc= c.getText().toString();
                String dd= d.getText().toString();
                i.putExtra("name",aa);
                i.putExtra("phone",bb);
                i.putExtra("mail",cc);
                i.putExtra("add",dd);
                startActivity(i);
            }
        });
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Screen2.this, Screen3.class);
//                String aa= a.getText().toString();
//                String bb= b.getText().toString();
//                String cc= c.getText().toString();
//                String dd= d.getText().toString();
//                i.putExtra("name",aa);
//                i.putExtra("phone",bb);
//                i.putExtra("mail",cc);
//                i.putExtra("add",dd);
//               startActivity(i);
//
//            }
//        });


    }
}