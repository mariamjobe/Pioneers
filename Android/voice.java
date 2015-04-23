package com.example.guest.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.os.PowerManager;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.
import android.util.Log;
import android.widget.TextView;



public class voice extends Activity implements{

    // keep the screen unlocked while launching the application
    protected PowerManager.WakeLock mWakeLock;

    // speech recognizer for callbacks
    private SpeechRecognizer mSpeechRecognizer;

    // handler to post changes to progress bar
    private Handler mHandler = new Handler();
    // ui text view
    TextView responseText;

    // intent for speech recognition
    Intent mSpeechIntent;
    // this bool will record that it is time ti kill P.A.L
    boolean killCommand = false;

    private static final String[] VALID_COMMANDS = {
     "call List",
      "music list",
      "call sos",
    };
    private static final int VALID_COMMANDS_SIZE = VALID_COMMANDS.length;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice);
        responseText = (TextView) findViewById(R.id.responseText);


    }
    @Override
    protected void onStart(){
        mSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(voice.this);
SpeechListener mRecognitionListener= new SpeechListener();
    mSpeechRecognizer.setRecognitionListener(mRecognitionListener);
   mSpeechIntent= new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        mSpeechIntent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,);
        // Giving a hint for what the recognizer is going to say
        mSpeechIntent.putExtra(Recognizer);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_voice, menu);
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
}
