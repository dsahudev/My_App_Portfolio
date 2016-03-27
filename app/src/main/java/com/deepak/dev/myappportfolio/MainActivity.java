package com.deepak.dev.myappportfolio;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonSpotifyStreamer, mButtonScoreApp, mButtonLibraryApp, mButtonBuildItBigger,
            mButtonXYZReader, mButtonCapStone;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        instantiate();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }

    private void instantiate() {
        mButtonSpotifyStreamer = (Button) findViewById(R.id.button);
        mButtonScoreApp = (Button) findViewById(R.id.button2);
        mButtonLibraryApp = (Button) findViewById(R.id.button3);
        mButtonBuildItBigger = (Button) findViewById(R.id.button4);
        mButtonXYZReader = (Button) findViewById(R.id.button5);
        mButtonCapStone = (Button) findViewById(R.id.button6);

        mButtonSpotifyStreamer.setOnClickListener(this);
        mButtonScoreApp.setOnClickListener(this);
        mButtonLibraryApp.setOnClickListener(this);
        mButtonBuildItBigger.setOnClickListener(this);
        mButtonXYZReader.setOnClickListener(this);
        mButtonCapStone.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(getApplicationContext(),"This button will launch "+"Spotify Streamer", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(),"This button will launch "+"Scores App", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(),"This button will launch "+"Library App", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(),"This button will launch "+"Build it Bigger", Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(),"This button will launch "+"XYZ Reader", Toast.LENGTH_LONG).show();
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(),"This button will launch "+"Capstone App", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
