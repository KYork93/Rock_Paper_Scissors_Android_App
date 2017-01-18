package example.codeclan.com.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 18/01/2017.
 */

public class RulesActivity extends AppCompatActivity{

    TextView instruction;
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView resultView;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instruction = (TextView)findViewById(R.id.user_instruction);
        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton = (Button)findViewById(R.id.scissors_button);
        resultView = (TextView)findViewById(R.id.result_view);

        Log.d(getClass().toString(), "onCreate got called");
    }

    public void onRockButtonPressed(View button){
        String buttonPressed = "rock";
        Log.d(getClass().toString(), "rockButtonOnCreate called");

        Rules rules = new Rules(buttonPressed);

        String result = rules.play();
        resultView.setText(result);
    }

    public void onPaperButtonPressed(View button){
        String buttonPressed = "paper";
        Log.d(getClass().toString(), "paperButtonOnCreate called");

        Rules rules = new Rules(buttonPressed);

        String result = rules.play();
        resultView.setText(result);
    }

    public void onScissorButtonPressed(View button){
        String buttonPressed = "rock";
        Log.d(getClass().toString(), "scissorButtonOnCreate called");

        Rules rules = new Rules(buttonPressed);

        String result = rules.play();
        resultView.setText(result);
    }



}
