package com.audreytechnologies.mclinic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class AskPatientActivity extends AppCompatActivity {

    ListView listView;
    String[] questionsArray;
    ArrayAdapter<String> adapter;
    ArrayList<String> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_patient);

        listView = (ListView) findViewById(R.id.askListView);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Answer me");
        makeListView();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.save);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void makeListView() {

        //making listview for questions

        String[] questionsArray  = {"Medical prescription", getString(R.string.question_1), getString(R.string.question_2), getString(R.string.question_3), getString(R.string.question_4), getString(R.string.question_5)};

        //or you ca try this method to insert data to a listview

        /* questionsArray = new String[]{"Medical prescription", getString(R.string.question_1), getString(R.string.question_2), getString(R.string.question_3), getString(R.string.question_4), getString(R.string.question_5)};
           listItems = new ArrayList<>(Arrays.asList(questionsArray));
        */
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item_layout_ask_patient, R.id.questions, questionsArray);
        listView.setAdapter(adapter);
        ViewCompat.setNestedScrollingEnabled(listView, true);
    }

}
