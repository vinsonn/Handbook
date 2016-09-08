package com.functionals.handbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout songsBtn = (LinearLayout) findViewById(R.id.songs_btn);
        songsBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    startActivity(new Intent(MainActivity.this, SongsActivity.class));
                }
            }
        );
        LinearLayout prayersBtn = (LinearLayout) findViewById(R.id.prayers_btn);
        prayersBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    startActivity(new Intent(MainActivity.this, PrayersActivity.class));
                }
            }
        );
        LinearLayout morseBtn = (LinearLayout) findViewById(R.id.morse_btn);
        morseBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    startActivity(new Intent(MainActivity.this, MorseActivity.class));
                }
            }
        );
        LinearLayout semaphoreBtn = (LinearLayout) findViewById(R.id.semaphore_btn);
        semaphoreBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    startActivity(new Intent(MainActivity.this, SemaphoreActivity.class));
                }
            }
        );
        LinearLayout roadSignsBtn = (LinearLayout) findViewById(R.id.road_signs_btn);
        roadSignsBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    startActivity(new Intent(MainActivity.this, RoadSignsActivity.class));
                }
            }
        );
        LinearLayout knotsBtn = (LinearLayout) findViewById(R.id.knots_btn);
        knotsBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    startActivity(new Intent(MainActivity.this, KnotsActivity.class));
                }
            }
        );
    }
}
