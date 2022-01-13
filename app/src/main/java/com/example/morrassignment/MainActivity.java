package com.example.morrassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText e1, e2, e3, e4, e5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName);
        e2 = findViewById(R.id.editTextTextPersonName2);
        e3 = findViewById(R.id.editTextTextPersonName3);
        e4 = findViewById(R.id.editTextTextPersonName4);
        e5 = findViewById(R.id.editTextTextPersonName5);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (e1.getText().toString().length() == 0 || e2.getText().toString().length() == 0 || e3.getText().toString().length() == 0 || e4.getText().toString().length() == 0 || e5.getText().toString().length() == 0) {
                            Toast.makeText(MainActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Payment Successful");
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();
                    }
                }


        );

    }
}