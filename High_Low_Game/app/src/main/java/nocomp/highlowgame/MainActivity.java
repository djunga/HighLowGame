package nocomp.hw1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
//int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        Random rand = new Random();
        num = rand.nextInt(100);*/
        setContentView(R.layout.activity_main);
        //initGuessButton();
    }
/*    private void initGuessButton() {
        Button displayButton = findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText editName = (EditText) findViewById(R.id.editTextName);
                TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
                String nameToDisplay = editName.getText().toString();
                Resources res = getResources();
                String displayString = res.getString(R.string.welcome_messages, nameToDisplay);
                textDisplay.setText(displayString);
            }
        });
    }*/
}
