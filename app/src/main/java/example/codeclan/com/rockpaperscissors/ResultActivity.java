package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 18/01/2017.
 */

public class ResultActivity extends AppCompatActivity{

    TextView resultText;
    Button getHome;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.result_activity);

        resultText = (TextView)findViewById(R.id.result_view);
        getHome = (Button)findViewById(R.id.home_button);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("result");

        resultText.setText(answer);

        Log.d(getClass().toString(), "Result activity onCreate");
    }

    public void onHomeButtonClicked(View button){
        Intent intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
    }

}
