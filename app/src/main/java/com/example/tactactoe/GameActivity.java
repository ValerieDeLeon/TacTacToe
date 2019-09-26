package com.example.tactactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    boolean player1 = true; // Player1 = X's
    boolean player2 = false; // PLayer2 = O's

    Button box_1 = (Button) findViewById(R.id.button1);
    Button box_2 = (Button) findViewById(R.id.button2);
    Button box_3 = (Button) findViewById(R.id.button3);
    Button box_4 = (Button) findViewById(R.id.button4);
    Button box_5 = (Button) findViewById(R.id.button5);
    Button box_6 = (Button) findViewById(R.id.button6);
    Button box_7 = (Button) findViewById(R.id.button7);
    Button box_8 = (Button) findViewById(R.id.button8);
    Button box_9 = (Button) findViewById(R.id.button9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamescreen);
    }

    // Game Board Functionality
    public void boardClick(Button square)
    {
        if (player1)
        {
            square.setText("X");
        }
        else if (player2)
        {
            square.setText("O");
        }
    }
}