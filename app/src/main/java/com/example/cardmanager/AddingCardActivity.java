package com.example.cardmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class AddingCardActivity extends AppCompatActivity {


    private Button button_frontCard, button_reverseCard;
    ImageView imageView_frontCard, imageView_reverseCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_card);



        ///////////////////////////////////////////////////////////////////
        imageView_frontCard = (ImageView) findViewById(R.id.imageView_frontCard);
        imageView_reverseCard = (ImageView) findViewById(R.id.imageView_reverseCard);
        ///////////////////////////////////////////////////////////////////


        button_frontCard = (Button) findViewById(R.id.button_frontCard);
        button_frontCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { dispatchTakePictureIntent(); }});
        ///////////////////////////////////////////////////////////////////
        button_reverseCard = (Button) findViewById(R.id.button_reverseCard);
        button_reverseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {dispatchTakePictureIntent(); }});
        ///////////////////////////////////////////////////////////////////



    }

    //End onCreate method

    private void dispatchTakePictureIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }




}

