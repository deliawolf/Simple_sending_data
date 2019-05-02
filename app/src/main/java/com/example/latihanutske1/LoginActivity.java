package com.example.latihanutske1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nnama, nemail, nusername, npassword;
    Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nnama = (EditText)findViewById(R.id.nama);
        nemail = (EditText)findViewById(R.id.email);
        nusername = (EditText)findViewById(R.id.username);
        kirim = (Button)findViewById(R.id.kirim);
        npassword = (EditText)findViewById(R.id.password);
        kirim.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String Nama = nnama.getText().toString();
        String Email = nemail.getText().toString();
        String Username = nusername.getText().toString();
        String Password = npassword.getText().toString();

        Intent intent = new Intent(LoginActivity.this,HasilActivity.class);
        intent.putExtra("nama",Nama);
        intent.putExtra("email",Email);
        intent.putExtra("username",Username);
        intent.putExtra("password",Password);
        startActivity(intent);
    }
}