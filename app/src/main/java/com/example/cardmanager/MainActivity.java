package com.example.cardmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonNewCard, buttonCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///////////////////////////////////////////////////////////////////
        buttonNewCard = (Button) findViewById(R.id.buttonNewCard);
        buttonNewCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddingCardActivity();
            }
        });
        ///////////////////////////////////////////////////////////////////
        buttonCards = (Button) findViewById(R.id.buttonCards);
        buttonCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOwnedCardsActivity();
            }
        });
        ///////////////////////////////////////////////////////////////////

    }
    //End onCreate method

    public void openAddingCardActivity() {
        Intent intent = new Intent(this, AddingCardActivity.class);
        startActivity(intent);
    }

    private void openOwnedCardsActivity() {
        Intent intent = new Intent(this, OwnedCardsActivity.class);
        startActivity(intent);
    }
}