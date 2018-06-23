package com.audreytechnologies.mclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    EditText mname, memailid, mphoneNumber, mpassword, mconfirmPassword;
    Button msignupButton;
    TextView mloginLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        
        mname = (EditText) findViewById(R.id.name);
        memailid = (EditText) findViewById(R.id.emailid);
        mphoneNumber = (EditText) findViewById(R.id.phoneNumber);
        mpassword = (EditText) findViewById(R.id.password);
        mconfirmPassword = (EditText) findViewById(R.id.confirmPassword);
        msignupButton = (Button) findViewById(R.id.signupButton);
        mloginLink = (TextView) findViewById(R.id.loginLink);
        
        msignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignupActivity.this, "Welcom to M-Clinic", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(intent);
            }
        });

        mloginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
