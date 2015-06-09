package com.mintnotes.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inflate the six buttons
        
        Button mApp1Button = (Button)findViewById(R.id.button);
        mApp1Button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Spotify App", Toast.LENGTH_SHORT).show();
            }
        });

        Button mApp2Button = (Button)findViewById(R.id.button2);
        mApp2Button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        Button mApp3Button = (Button)findViewById(R.id.button3);
        mApp3Button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Library App", Toast.LENGTH_SHORT).show();
            }
        });

        Button mApp4Button = (Button)findViewById(R.id.button4);
        mApp4Button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch the Build it bigger App", Toast.LENGTH_SHORT).show();
            }
        });

        Button mApp5Button = (Button)findViewById(R.id.button5);
        mApp5Button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Reader App", Toast.LENGTH_SHORT).show();
            }
        });

        Button mApp6Button = (Button)findViewById(R.id.button6);
        mApp6Button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my own App", Toast.LENGTH_SHORT).show();
            }
        });
    }


    // @Override
    // public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu);
        // return true;
    // }

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
}
