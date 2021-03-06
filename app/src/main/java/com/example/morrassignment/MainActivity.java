package com.example.morrassignment;

import androidx.appcompat.app.AppCompatActivity;
import static androidx.core.os.LocaleListCompat.create;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    TextView v1,v2,v3,v4,v5;
    int count=0;
    AlertDialog.Builder alertBuilder;
    Button b1;
    Valiadation obj=new Valiadation();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editTextCARDNumber);
        e2=(EditText) findViewById(R.id.edittext2);
        e3=(EditText) findViewById(R.id.edittext3);
        e4=(EditText) findViewById(R.id.edittext4);
        e5=(EditText) findViewById(R.id.edittext5);
        v1=(TextView)findViewById(R.id.textViewFORCARDnumber);
        v2=(TextView)findViewById(R.id.textView2);
        v3=(TextView)findViewById(R.id.textView3);
        v4=(TextView)findViewById(R.id.textView4);
        v5=(TextView)findViewById(R.id.textView5);
        b1=(Button)findViewById(R.id.SUBMITbutton);
        //For checking all condition is true or not

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;


                if(obj.IsValid(e1.getText().toString()))
                {
                    if(obj.type_validation(e1.getText().toString())==false)
                    {
                        v1.setText("Invalid Creditcard Number");
                        count=0;
                    }
                    else
                    {
                        v1.setText("");
                        count+=1;
                    }
                }
                else
                {
                    v1.setText("Invalid Creditcard Number");
                    count=0;
                }

                if(obj.cvv_validation(e2.getText().toString())==false)
                {
                    v2.setText("Invalid cvv ");
                    count=0;
                }
                else
                {
                    v2.setText("");
                    count+=1;
                }

                if(obj.date_validation(e3.getText().toString())==false)
                {
                    v3.setText("Invalid date");
                    count=0;
                }
                else
                {
                    v3.setText("");
                    count+=1;
                }

                if(obj.Name_validation(e4.getText().toString())==false)
                {
                    v4.setText("Invalid Name");
                    count=0;
                }
                else
                {
                    v4.setText("");
                    count+=1;
                }

                if(obj.Name_validation(e5.getText().toString())==false)
                {
                    v5.setText("Invalid Name");
                    count=0;
                }
                else
                {
                    v5.setText("");
                    count+=1;
                }

                if(count==5)
                {
                    alertBuilder = new AlertDialog.Builder(MainActivity.this);
                    alertBuilder.setTitle("Payment Successful");
                    alertBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            Toast.makeText(MainActivity.this, "Payment Successful", Toast.LENGTH_LONG).show();
                        }
                    });
                    AlertDialog alertDialog = alertBuilder.create();
                    alertDialog.show();

                }


            }
        });
    }
}