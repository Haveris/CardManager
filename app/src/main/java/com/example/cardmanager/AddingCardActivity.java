package com.example.cardmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.widget.Button;



public class AddingCardActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private Button button_frontCard, button_reverseCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_card);



        ///////////////////////////////////////////////////////////////////
        button_frontCard = (Button) findViewById(R.id.button_frontCard);
        button_frontCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { dispatchTakePictureIntent(); }});
        ///////////////////////////////////////////////////////////////////
        button_reverseCard = (Button) findViewById(R.id.button_reverseCard);
        button_reverseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent(); }});
        ///////////////////////////////////////////////////////////////////
    }

    //End onCreate method

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        } catch (ActivityNotFoundException e) {
            // display error state to the user
        }
    }


}

