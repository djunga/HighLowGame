package nocomp.highlowgame;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Random rand = new Random();
        num = rand.nextInt(100);
        setContentView(R.layout.activity_main);
        TextView answer = findViewById(R.id.Answer);
        Resources res = getResources();
        //answer.setText(res.getString(R.string.answer, num));
        String numStr = "" + num;
        String answerString = res.getString(R.string.answer, numStr);
        answer.setText(answerString);
        initGuessButton();
    }
    private void initGuessButton() {
        Button guessButton = findViewById(R.id.buttonGuess);
        guessButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText editGuess = findViewById(R.id.editTextGuess);
                TextView textResponse = findViewById(R.id.textViewResponse);
                int input = Integer.parseInt(editGuess.getEditableText().toString());
                Resources res = getResources();
                if(input > num) {
                    String tooHighString = res.getString(R.string.tooHigh);
                    textResponse.setText(tooHighString);
                    textResponse.setVisibility(VISIBLE);
                }
                else if(input < num) {
                    String tooLowString = res.getString(R.string.tooLow);
                    textResponse.setText(tooLowString);
                    textResponse.setVisibility(VISIBLE);
                }
                else {
                    String correctString = res.getString(R.string.correct);
                    textResponse.setText(correctString);
                    textResponse.setVisibility(VISIBLE);
                }
            }
        });
    }
}
