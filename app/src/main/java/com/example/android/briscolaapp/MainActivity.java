package com.example.android.briscolaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * scoreTeamA shows points for team "MI"
     * scoreTeamB shows points for team "VI"
     * winnerA shows round score for team "MI"
     * winnerB shows round score for team "VI"
     * clicksFante, clicksCaval, clicksRe, clicksThree, clicksAce counts number of button clicks
     * maxNumberOfClicks is the max number of button clicks
     * maxPoints is the max points in one round
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int winnerA = 0;
    int winnerB = 0;
    int clicksFante, clicksCaval, clicksRe, clicksThree, clicksAce = 0;
    int maxNumberOfClicks = 4;
    int maxPoints = 120;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays round score for Team A.
     */
    public void displayWinnerA(int winnerScore) {
        TextView winnerView = (TextView) findViewById(R.id.winner_a_score);
        winnerView.setText(String.valueOf(winnerScore));
    }

    /**
     * Displays round score for Team B.
     */
    public void displayWinnerB(int winnerScore) {
        TextView scoreView = (TextView) findViewById(R.id.winner_b_score);
        scoreView.setText(String.valueOf(winnerScore));
    }

    /**
     * Button Fante gives two points.
     */
    public void btnFanteA(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksFante == maxNumberOfClicks)) {
           btn = (Button) findViewById(R.id.fante_card_A);
           scoreTeamA = scoreTeamA;
        } else {
            clicksFante++;
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
        }
    }

    public void btnFanteB(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksFante == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.fante_card_B);
            scoreTeamB = scoreTeamB;
        }else {
            clicksFante++;
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Button Caval gives three points.
     */
    public void btnCavalA(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksCaval == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.caval_card_A);
            scoreTeamA = scoreTeamA;
        } else {
            clicksCaval++;
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
        }
    }

    public void btnCavalB(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksCaval == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.caval_card_B);
            scoreTeamB = scoreTeamB;
        } else {
            clicksCaval++;
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Button Re gives four points.
     */
    public void btnReA(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksRe == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.king_card_A);
            scoreTeamA = scoreTeamA;
        } else {
            clicksRe++;
            scoreTeamA = scoreTeamA + 4;
            displayForTeamA(scoreTeamA);
        }
    }

    public void btnReB(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksRe == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.king_card_B);
            scoreTeamB = scoreTeamB;
        } else {
            clicksRe++;
            scoreTeamB = scoreTeamB + 4;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Button Card #3 gives ten points.
     */
    public void btnNumberThreeA(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksThree == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.three_card_A);
            scoreTeamA = scoreTeamA;
        } else {
            clicksThree++;
            scoreTeamA = scoreTeamA + 10;
            displayForTeamA(scoreTeamA);
        }
    }

    public void btnNumberThreeB(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksThree == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.three_card_B);
            scoreTeamB = scoreTeamB;
        } else {
            clicksThree++;
            scoreTeamB = scoreTeamB + 10;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Button Ace gives eleven points.
     */
    public void btnAceA(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksAce == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.ace_card_A);
            scoreTeamA = scoreTeamA;
        } else {
            clicksAce++;
            scoreTeamA = scoreTeamA + 11;
            displayForTeamA(scoreTeamA);
        }
    }

    public void btnAceB(View view) {
        if((scoreTeamA + scoreTeamB == maxPoints) || (clicksAce == maxNumberOfClicks)) {
            btn = (Button) findViewById(R.id.ace_card_B);
            scoreTeamB = scoreTeamB;
        } else {
            clicksAce++;
            scoreTeamB = scoreTeamB + 11;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * This method resets numbet of button clicks on zero
     */
    public void resetClicks(View view) {
        clicksFante = 0; clicksCaval = 0; clicksRe = 0; clicksThree = 0; clicksAce = 0;
    }

    /**
     * This method resets all score and clicks in the game
     */
    public void reset(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        resetClicks(view);
        winnerA = 0;
        displayWinnerA(winnerA);
        winnerB = 0;
        displayWinnerB(winnerB);
        Toast.makeText(this, "The game was reseted", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method starts new round with all possible outcomes (there is four rounds)
     * Team "MI" has more points, team "VI" has more points, or it is tie.
     * Also scoreTeamA + scoreTeamB must be equal maxPoints, or in this case 120.
     */
    public void newRound(View view) {
        if((scoreTeamA > scoreTeamB) && (scoreTeamA + scoreTeamB == maxPoints)) {
            winnerA = winnerA + 1;
            if(winnerA != 4) {
                displayWinnerA(winnerA);
                Toast.makeText(this, "MI wins this round!", Toast.LENGTH_SHORT).show();
                resetClicks(view);
                scoreTeamA = 0;
                displayForTeamA(scoreTeamA);
                scoreTeamB = 0;
                displayForTeamB(scoreTeamB);
            } else {
                displayWinnerA(winnerA);
                Toast.makeText(this, "MI has won the game!", Toast.LENGTH_SHORT).show();
                resetClicks(view);
                scoreTeamA = 0;
                displayForTeamA(scoreTeamA);
                scoreTeamB = 0;
                displayForTeamB(scoreTeamB);
                winnerA = 0;
                displayWinnerA(winnerA);
                winnerB = 0;
                displayWinnerB(winnerB);
            }
        } else if((scoreTeamB > scoreTeamA) && (scoreTeamB + scoreTeamA == maxPoints)) {
            winnerB = winnerB + 1;
            if(winnerB != 4) {
                displayWinnerB(winnerB);
                Toast.makeText(this, "VI wins this round!", Toast.LENGTH_SHORT).show();
                resetClicks(view);
                scoreTeamA = 0;
                displayForTeamA(scoreTeamA);
                scoreTeamB = 0;
                displayForTeamB(scoreTeamB);
            } else {
                displayWinnerB(winnerB);
                Toast.makeText(this, "VI has won the game!", Toast.LENGTH_SHORT).show();
                resetClicks(view);
                scoreTeamA = 0;
                displayForTeamA(scoreTeamA);
                scoreTeamB = 0;
                displayForTeamB(scoreTeamB);
                winnerA = 0;
                displayWinnerA(winnerA);
                winnerB = 0;
                displayWinnerB(winnerB);
            }
        } else if(((scoreTeamA > scoreTeamB) || (scoreTeamB > scoreTeamA))
                && (scoreTeamA + scoreTeamB != maxPoints)) {
            Toast.makeText(this, "Sum of points has to be 120!", Toast.LENGTH_SHORT).show();
        }  else {
            displayWinnerA(winnerA);
            displayWinnerB(winnerB);
            Toast.makeText(this, "This round is draw!", Toast.LENGTH_SHORT).show();
            resetClicks(view);
            scoreTeamA = 0;
            displayForTeamA(scoreTeamA);
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
        }
    }
}