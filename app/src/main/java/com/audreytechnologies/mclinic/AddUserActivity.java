package com.audreytechnologies.mclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddUserActivity extends AppCompatActivity {

    Button mnextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        mnextButton = (Button) findViewById(R.id.nextButton);

        mnextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddUserActivity.this, AskPatientActivity.class);
                startActivity(intent);
            }
        });
    }
}
