package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 18/01/2017.
 */

public class RulesActivity extends AppCompatActivity{

    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorsButton;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (ImageButton)findViewById(R.id.rock_button);
        paperButton = (ImageButton)findViewById(R.id.paper_button);
        scissorsButton = (ImageButton)findViewById(R.id.scissors_button);
        intent = new Intent(RulesActivity.this, ResultActivity.class);

        Log.d(getClass().toString(), "onCreate got called");
    }

    public void onRockButtonPressed(View button) {
        String buttonPressed = "rock";

        Rules rules = new Rules(buttonPressed);
        Log.d(getClass().toString(), "rockButtonOnCreate called");

        String result = rules.play();
        intent.putExtra("result", result);

        startActivity(intent);
    }

    public void onPaperButtonPressed(View button){
        String buttonPressed = "paper";

        Rules rules = new Rules(buttonPressed);
        Log.d(getClass().toString(), "paperButtonOnCreate called");

        String result = rules.play();
        intent.putExtra("result", result);

        startActivity(intent);
    }

    public void onScissorButtonPressed(View button){
        String buttonPressed = "scissors";

        Rules rules = new Rules(buttonPressed);
        Log.d(getClass().toString(), "scissorButtonOnCreate called");


        String result = rules.play();
        intent.putExtra("result", result);

        startActivity(intent);
    }



}
