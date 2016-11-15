package com.hfad.audiosample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button r1 , r2 , r3 ;
    MediaPlayer mp = null ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (Button)findViewById(R.id.btn1);
        r2 = (Button)findViewById(R.id.btn2);
        r3 = (Button)findViewById(R.id.btn3);



        r1.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick ( View v ) {
                if ( mp != null ) {
                    mp.reset () ;
                    mp.release () ;
                }
                mp = MediaPlayer.create(getApplicationContext(),R.raw.song1);
                mp.start () ;
            }
        });


    }
}
