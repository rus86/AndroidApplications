package com.corp.rus.hwapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Get data from view
        Intent intent = getIntent();
        String inputMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Create new element for displaying message
        TextView textView = new TextView(this);
        textView.setText(inputMessage);
        textView.setTextSize(40);

        //Add view element to layout
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.secondViewContent);
        layout.addView(textView);
    }

    public void openFirstTab(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
