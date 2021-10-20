package com.example.intent_expilicient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstname,surname,mobilenum,email,password;


    String namefirst,namesur,nummobile,email1,password1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = findViewById(R.id.first_name);
        surname = findViewById(R.id.sur_name);
        mobilenum = findViewById(R.id.mobile_number);
        email = findViewById(R.id.email);
        password = findViewById(R.id.passsword);

    }

    public void sigin(View view) {
        namefirst = firstname.getText().toString();
        namesur = surname.getText().toString();
        nummobile = mobilenum.getText().toString();
        email1 = email.getText().toString();
        password1 = password.getText().toString();

        Intent intent = new Intent(MainActivity.this, secondpage.class);
        intent.putExtra("namefirst",namefirst);
        intent.putExtra("namesur",namesur);
        intent.putExtra("namemobile",nummobile);
        intent.putExtra("nameemail",email1);
        intent.putExtra("namepassword1",password1);
        startActivity(intent);

    }
}