package com.zavierdev.whatsanimal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.StringTokenizer;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_KLASIFIKASI = "extra_klasifikasi";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_SOUND = "extra_sound";

    private Toolbar toolbar;
    private MediaPlayer myplayer;

    private boolean checkMusicActive = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        setContentView(R.layout.activity_detail_activity);

        /*CircleImageView titleImage = findViewById(R.id.title_image);
        TextView titledetail = findViewById(R.id.detail_title);*/

        ImageView imagehewan = findViewById(R.id.detail_hewan_image);

        TextView textnamahewan = findViewById(R.id.Text_Nama_Hewan);

        TextView textkingdom = findViewById(R.id.kingdom_detail);
        TextView textfilum = findViewById(R.id.filum_detail);
        TextView textfamilia = findViewById(R.id.familia_detail);
        TextView textkelas = findViewById(R.id.kelas_detail);
        TextView textordo = findViewById(R.id.ordo_detail);
        TextView textgenus = findViewById(R.id.genus_detail);
        TextView textspesies = findViewById(R.id.spesies_detail);

        TextView textdetailhewan = findViewById(R.id.Content_Detail);

        final String nama_hewan = getIntent().getStringExtra(EXTRA_NAME);
        String klasifikasi_hewan = getIntent().getStringExtra(EXTRA_KLASIFIKASI);
        String detail_hewan = getIntent().getStringExtra(EXTRA_DETAIL);
        int detail_photo = getIntent().getIntExtra(EXTRA_PHOTO,0);

        StringTokenizer token = new StringTokenizer(klasifikasi_hewan,"|");

        /*toolbar = (Toolbar) findViewById(R.id.toolbarDetail);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");*/

        /*toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(detail_activity.this,MainActivity.class);
                startActivity(myintent);
            }
        });*/

        /*titledetail.setText(nama_hewan);
        Glide.with(titleImage)
                .load(detail_photo)
                .into(titleImage);*/

        ImageView backbutton = findViewById(R.id.back_buttons);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkMusicActive) {
                    checkMusicActive = false;
                    myplayer.stop();
                }
                Intent myintent = new Intent(DetailActivity.this,MainActivity.class);
                startActivity(myintent);
            }
        });

        Glide.with(imagehewan)
                .load(detail_photo)
                .into(imagehewan);

        ImageView hewandetailimage = findViewById(R.id.detail_hewan_image);
        hewandetailimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soundhewan = getIntent().getIntExtra(EXTRA_SOUND,0);
                int check = R.raw.no_sound;

                if(checkMusicActive) {
                 checkMusicActive = false;
                 myplayer.stop();
                }
                if(soundhewan == check) {
                    Toast.makeText(DetailActivity.this,"Suara Tidak Ditemukan",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(DetailActivity.this,"Suara "+nama_hewan,Toast.LENGTH_SHORT).show();
                    myplayer = MediaPlayer.create(DetailActivity.this,soundhewan);
                    myplayer.start();
                    checkMusicActive = true;
                }

            }
        });

        textnamahewan.setText(nama_hewan);

        textkingdom.setText(token.nextToken());
        textfilum.setText(token.nextToken());
        textfamilia.setText(token.nextToken());
        textkelas.setText(token.nextToken());
        textordo.setText(token.nextToken());;
        textgenus.setText(token.nextToken());
        textspesies.setText(token.nextToken());

        textdetailhewan.setText(detail_hewan);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(checkMusicActive) {
            checkMusicActive = false;
            myplayer.stop();
        }
    }
}
