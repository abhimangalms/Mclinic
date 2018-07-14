package com.audreytechnologies.mclinic;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserProfile extends AppCompatActivity {

    Button mdelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        mdelete = (Button) findViewById(R.id.delete);
        mdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                new android.app.AlertDialog.Builder(UserProfile.this)
                        .setIcon(android.R.drawable.ic_menu_delete)
                        .setTitle("Delete ?")
                        .setMessage("Are you sure you want to delete this profile ?")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Intent i = new Intent(UserProfile.this, MainActivity.class);

                                Toast.makeText(UserProfile.this, "One profile deleted", Toast.LENGTH_SHORT).show();

                                startActivity(i);
                                finish();
                                //finish();
                            }

                        })
                        .setNegativeButton("No", null)
                        .show();


            }
        });
    }

}
