package com.example.intent_expilicient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondpage extends AppCompatActivity {

    TextView firsttext,surnametext,mobiletext,passwordtext,emailtext;

    String getfirsttext,getsurnametext,getmobiletext,getpasswordtext,getemailtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        firsttext    = findViewById(R.id.first_text);
        surnametext  = findViewById(R.id.surname_text);
        mobiletext   = findViewById(R.id.mobile_text);
        passwordtext = findViewById(R.id.password_text);
        emailtext    = findViewById(R.id.email_text);

        getfirsttext = getIntent().getStringExtra("namefirst");
        firsttext.setText(""+getfirsttext);

        getsurnametext = getIntent().getStringExtra("namesur");
        surnametext.setText(""+getsurnametext);

        getmobiletext = getIntent().getStringExtra("namemobile");
        mobiletext.setText(""+getmobiletext);

        getpasswordtext = getIntent().getStringExtra("nameemail");
        passwordtext.setText(""+getpasswordtext);

        getemailtext = getIntent().getStringExtra("namepassword1");
        emailtext.setText(""+getemailtext);
    }
}