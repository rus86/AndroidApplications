package com.corp.rus.hwapplication;

import android.content.Intent;
import android.database.DatabaseUtils;
import android.graphics.Camera;
import android.graphics.Color;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    public void openSecondTab(View view){
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String inputText = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, inputText);
//        startActivity(intent);
//    }

    public void openFirstTab(View view){
        TextView firstTab = (TextView) findViewById(R.id.firstTab);
        firstTab.setBackgroundColor(Color.GRAY);
        markDisabled(R.id.secondTab, R.id.thirdTab);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("First tab");
    }

    public void openSecondTab(View view){
        TextView secondTab = (TextView) findViewById(R.id.secondTab);
        secondTab.setBackgroundColor(Color.GRAY);
        markDisabled(R.id.firstTab, R.id.thirdTab);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Second tab");
    }

    public void openThirdTab(View view){
        TextView thirdTab = (TextView) findViewById(R.id.thirdTab);
        thirdTab.setBackgroundColor(Color.GRAY);
        markDisabled(R.id.firstTab, R.id.secondTab);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Third tab");
    }

    /**
     * Mark tabs as disabled
     * @param elementIDs
     */
    private void markDisabled(Integer... elementIDs) {
        for (int i = 0; i < elementIDs.length; i++) {
            TextView tab = (TextView) findViewById(elementIDs[i]);
            tab.setBackgroundColor(Color.WHITE);
        }
    }


}
