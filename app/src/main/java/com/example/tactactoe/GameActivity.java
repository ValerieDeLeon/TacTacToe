package com.example.tactactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private Button[][] buttonSquare = new Button[3][3];
    private boolean player1 = true;
    private int roundCount;

//    private int player1Points;
//    private int player2Points;
//    private TextView player1_score;
//    private TextView player2_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamescreen);

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                String buttonID = "button" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttonSquare[i][j] = findViewById(resID);
                buttonSquare[i][j].setOnClickListener(this);
            }
        }
    }

    // Game Board Functionality
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
}