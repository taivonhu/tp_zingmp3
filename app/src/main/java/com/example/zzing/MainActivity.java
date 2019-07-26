package com.example.zzing;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    TextView txtTit, txtSta, txtEn;
    SeekBar seekBar;
    ImageButton btnP, btnS, btnN;
    ArrayList<Song> arraySong;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        AddSong();

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, arraySong.get(position).getFile());
                mediaPlayer.start();
                txtTit.setText(arraySong.get(position).getTitle());
            }
        });
    }

    private void AddSong() {
        arraySong = new ArrayList<>();
        arraySong.add(new Song("Chua Bao Gio", R.raw.chuabaogio));







    }

    private void Anhxa() {
        txtTit =(TextView) findViewById(R.id.txtTitle);
        txtEn =(TextView) findViewById(R.id.txtEnd);
        txtSta =(TextView) findViewById(R.id.txtStart);
        seekBar =(SeekBar) findViewById(R.id.seekBar);
        btnN =(ImageButton) findViewById(R.id.btnNext);
        btnP = (ImageButton) findViewById(R.id.btnPre);
        btnS = (ImageButton) findViewById(R.id.btnStop);

    }
}
