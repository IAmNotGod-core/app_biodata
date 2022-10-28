package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgProfile = findViewById(R.id.imgProfile);
        Button btnAddr = findViewById(R.id.btnAddr);
        Button btnTelp = findViewById(R.id.btnTelp);
        Button btnEmail = findViewById(R.id.btnEmail);

        imgProfile.setImageResource(R.drawable.profile);

        btnAddr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Jl. Magersari II No.56 Pendrikan Kidul", Toast.LENGTH_LONG).show();
            }
        });

        btnTelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "082242161769", Toast.LENGTH_SHORT).show();
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "lintngkk09@gmail.com", Toast.LENGTH_SHORT).show();
            }
        });
    }
}