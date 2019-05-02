package com.example.latihanutske1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class HasilActivity extends AppCompatActivity {

    TextView hasilnama,hasilemail,hasilusername,hasilpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        hasilnama = (TextView)findViewById(R.id.hasilnama);
        hasilemail = (TextView)findViewById(R.id.hasilemail);
        hasilusername = (TextView)findViewById(R.id.hasilusername);
        hasilpassword = (TextView)findViewById(R.id.hasilpassword);

        hasilnama.setText("Nama :"+getIntent().getStringExtra("nama"));
        hasilemail.setText("Email :"+getIntent().getStringExtra("email"));
        hasilusername.setText("Username :"+getIntent().getStringExtra("username"));
        hasilpassword.setText("Password :"+getIntent().getStringExtra("password"));

    }

}
