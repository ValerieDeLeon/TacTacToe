package com.example.tactactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    public Button[][] buttonSquare = new Button[3][3];
    public boolean player1 = true;
    public int roundCount;
    
    public TextView player1_score;
    public TextView player2_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamescreen);

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; i < 3; i++)
            {
                String buttonID = "button" + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttonSquare[i][j] = findViewById(resID);
                buttonSquare[i][j].setOnClickListener(this);
            }
        }
    }

    // Game Board Functionality
    @Override
    public void onClick(View view)
    {
        if(!((Button) view).getText().toString().equals(""))
        {
            return;
        }
        if (player1)
            ((Button) view).setText("X");
        else
            ((Button) view).setText("O");

        roundCount++;
    }
}
