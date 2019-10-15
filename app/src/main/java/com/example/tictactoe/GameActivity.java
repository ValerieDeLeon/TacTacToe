
package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, resetButton;
    boolean player1 = true;
    int roundCount;

    int player1Score;
    int player2Score;

    TextView player1_score;
    TextView player2_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamescreen);


//
        resetButton = (Button) findViewById(R.id.resetButton);
        player1_score = findViewById(R.id.play1_score);
        player2_score = findViewById(R.id.play2_score);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);


        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent myIntent = new Intent(GameActivity.this,
                        MainActivity.class);
                startActivity(myIntent);

            }
        });//end of click listener

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button0)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button0)).setText("X");
                    else
                        ((Button) findViewById(R.id.button0)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();

                }
            }

        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button1)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button1)).setText("X");
                    else
                        ((Button) findViewById(R.id.button1)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();
                }
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button2)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button2)).setText("X");
                    else
                        ((Button) findViewById(R.id.button2)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();
                }
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button3)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button3)).setText("X");
                    else
                        ((Button) findViewById(R.id.button3)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();
                }
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button4)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button4)).setText("X");
                    else
                        ((Button) findViewById(R.id.button4)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();
                }
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button5)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button5)).setText("X");
                    else
                        ((Button) findViewById(R.id.button5)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();
                }
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button6)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button6)).setText("X");
                    else
                        ((Button) findViewById(R.id.button6)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();
                }
            }

        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button7)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button7)).setText("X");
                    else
                        ((Button) findViewById(R.id.button7)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();
                }
            }

        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) findViewById(R.id.button8)).getText() == "") {
                    if (player1)
                        ((Button) findViewById(R.id.button8)).setText("X");
                    else
                        ((Button) findViewById(R.id.button8)).setText("O");

                    player1 = !player1;
                    roundCount++;
                    checkForWin();
                }
            }

        });
    }
    // Game Board Functionality

//        private void resetBoard()
//        {
//            for (int i = 0; i < 8; i++) {
//
//                buttonSquare[i].setText("");
//
//            }
//
//            roundCount = 0;
//            player1 = true;
//        }


    public void checkForWin() {
        Button ticTacButtons[] = {button0, button1, button2, button3, button4, button5, button6, button7, button8};
        if ((ticTacButtons[0].getText() != "" && ticTacButtons[0].getText() == ticTacButtons[1].getText()) && (ticTacButtons[0].getText() == ticTacButtons[2].getText())) {
            if (ticTacButtons[0].getText() == "X") {
                Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_LONG).show();
                player1Score++;
                restartGame();
            }
            if (ticTacButtons[0].getText() == "O") {
                Toast.makeText(this, "Player 2 WIns", Toast.LENGTH_LONG).show();
                player2Score++;
                restartGame();
            }
        }

        if ((ticTacButtons[0].getText() != "" && ticTacButtons[0].getText() == ticTacButtons[4].getText()) && (ticTacButtons[0].getText() == ticTacButtons[8].getText())) {
            if (ticTacButtons[0].getText() == "X") {
                Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_LONG).show();
                player1Score++;
                restartGame();
            }
            if (ticTacButtons[0].getText() == "O") {
                Toast.makeText(this, "Player 2 WIns", Toast.LENGTH_LONG).show();
                player2Score++;
                restartGame();
            }
        }

        if ((ticTacButtons[0].getText() != "" && ticTacButtons[0].getText() == ticTacButtons[3].getText()) && (ticTacButtons[0].getText() == ticTacButtons[6].getText())) {
            if (ticTacButtons[0].getText() == "X") {
                Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_LONG).show();
                player1Score++;
                restartGame();
            }
            if (ticTacButtons[0].getText() == "O") {
                Toast.makeText(this, "Player 2 WIns", Toast.LENGTH_LONG).show();
                player2Score++;
                restartGame();
            }
        }

        if ((ticTacButtons[3].getText() != "" && ticTacButtons[3].getText() == ticTacButtons[4].getText()) && (ticTacButtons[3].getText() == ticTacButtons[5].getText())) {
            if (ticTacButtons[3].getText() == "X") {
                Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_LONG).show();
                player1Score++;
                restartGame();
            }
            if (ticTacButtons[3].getText() == "O") {
                Toast.makeText(this, "Player 2 WIns", Toast.LENGTH_LONG).show();
                player2Score++;
                restartGame();
            }
        }

        if ((ticTacButtons[6].getText() != "" && ticTacButtons[6].getText() == ticTacButtons[7].getText()) && (ticTacButtons[6].getText() == ticTacButtons[8].getText())) {
            if (ticTacButtons[6].getText() == "X") {
                Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_LONG).show();
                player1Score++;
                restartGame();
            }
            if (ticTacButtons[6].getText() == "O") {
                Toast.makeText(this, "Player 2 WIns", Toast.LENGTH_LONG).show();
                player2Score++;
                restartGame();

            }
        }

        if ((ticTacButtons[2].getText() != "" && ticTacButtons[2].getText() == ticTacButtons[5].getText()) && (ticTacButtons[2].getText() == ticTacButtons[8].getText())) {
            if (ticTacButtons[2].getText() == "X") {
                Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_LONG).show();
                player1Score++;
                restartGame();
            }
            if (ticTacButtons[2].getText() == "O") {
                Toast.makeText(this, "Player 2 WIns", Toast.LENGTH_LONG).show();
                player2Score++;
                restartGame();
            }
        }

        if ((ticTacButtons[1].getText() != "" && ticTacButtons[1].getText() == ticTacButtons[4].getText()) && (ticTacButtons[1].getText() == ticTacButtons[7].getText())) {
            if (ticTacButtons[1].getText() == "X") {
                Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_LONG).show();
                player1Score++;
                restartGame();
            }
            if (ticTacButtons[1].getText() == "O") {
                Toast.makeText(this, "Player 2 WIns", Toast.LENGTH_LONG).show();
                player2Score++;
                restartGame();
            }
        }

        if ((ticTacButtons[2].getText() != "" && ticTacButtons[2].getText() == ticTacButtons[4].getText()) && (ticTacButtons[2].getText() == ticTacButtons[6].getText())) {
            if (ticTacButtons[2].getText() == "X") {
                Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_LONG).show();
                player1Score++;
                restartGame();
            }
            if (ticTacButtons[2].getText() == "O") {
                Toast.makeText(this, "Player 2 WIns", Toast.LENGTH_LONG).show();
                player2Score++;
                restartGame();
            }
        }
            if (roundCount > 8) {
                Toast.makeText(this, "CAT, No winner", Toast.LENGTH_LONG).show();
                restartGame();

            }

    }

        public void restartGame () {
            roundCount = 0;
            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");

            TextView P1Score = (TextView) findViewById(R.id.play1_score);
            TextView P2Score = (TextView) findViewById(R.id.play2_score);

            P1Score.setText("Player 1 Score: " + player1Score);
            P2Score.setText("Player 2 Score: " + player2Score);
        }

    }





