package com.example.tactactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    // Variables
    private Button[] buttonSquare = new Button[9];
    private boolean player1 = true;
    private int roundCount;
    private int player1Points = 0;
    private int player2Points = 0;
//    private TextView player1_score;
//    private TextView player2_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamescreen);

        // Gets button ID's & listens for activation
        for (int i = 0; i < buttonSquare.length; i++)
        {
                String buttonID = "button" + i;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttonSquare[i] = findViewById(resID);
                buttonSquare[i].setOnClickListener(this);
        }

        // Reset Button Functionality
        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetGame();
            }
        });
    }

    // Game Board Functionality (Turning & Scoring)
    @Override
    public void onClick(View v)
    {
        if(!((Button) v).getText().toString().equals(""))
        {
            return;
        }
        if (player1)
            ((Button) v).setText("X");
        else
            ((Button) v).setText("O");

        roundCount++;
    }

    // Resets Game
    private void resetBoard()
    {
        for (int i = 0; i < buttonSquare.length; i++)
        {
            buttonSquare[i].setText("");
        }

        roundCount = 0;
        player1 = true;
    }

    private void resetGame()
    {
        player1Points = 0;
        player2Points = 0;
//        updatePointsText();
        resetBoard();
    }
}