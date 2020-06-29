package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
TextView textView;
EditText edittext;

Button euro,yen,dinar,ausdollar,candollar,bitcoin,dollar,pound,rubel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bitcoin=findViewById(R.id.bitcoin);
        candollar=findViewById(R.id.candollar);
        ausdollar=findViewById(R.id.ausdollar);
        rubel=findViewById(R.id.rubel);
        pound=findViewById(R.id.pound);
        dinar=findViewById(R.id.dinar);
        yen=findViewById(R.id.yen);
        euro=findViewById(R.id.euro);
        dollar=findViewById(R.id.dollar);
        textView=findViewById(R.id.textView) ;
        edittext=findViewById(R.id.editText);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                 edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*0.012 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                    edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*1.42 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });
     dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                    edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*0.0041 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                    edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*0.011 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                    edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*0.018 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });
        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                    edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*0.019 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });
       dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                    edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*0.013 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                    edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*0.000014 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });
        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String z= edittext.getText().toString();

                if(TextUtils.isEmpty(z))
                    edittext.setError("please enter a input");
                else {
                    double n, k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
                    k=n*0.092 ;//converting rupees to euro
                    //Formatter formatter=new Formatter();
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));

                }
            }
        });

    }
}
