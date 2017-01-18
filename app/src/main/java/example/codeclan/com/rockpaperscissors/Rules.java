package example.codeclan.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */

public class Rules {

    private String playerChoice;
    String randomGen;
    private ArrayList<String> options;

    public Rules(String playerChoice){
        this.playerChoice = playerChoice;
        this.options = new ArrayList<String>();
        setUp();
    }

    public String matchup() {
        if (playerChoice == "scissors" && randomGen == "scissors") {
            return "Draw";
        } else if (playerChoice == "rock" && randomGen == "rock") {
            return "Draw";
        } else if (playerChoice == "paper" && randomGen == "paper") {
            return "Draw";
        } else if (playerChoice == "scissors" && randomGen == "rock") {
            return "You lose!";
        } else if (playerChoice == "scissors" && randomGen == "paper") {
            return "You win!";
        } else if (playerChoice == "rock" && randomGen == "paper") {
            return "You lose!";
        } else if (playerChoice == "paper" && randomGen == "rock") {
            return "You win!";
        } else if (playerChoice == "rock" && randomGen == "scissors") {
            return "You win!";
        } else if (playerChoice == "paper" && randomGen == "scissors") {
            return "You lose!";
        } else
            return "You broke it";
    }

    private void setUp(){
        String[] optionsToAdd = {
                "rock",
                "paper",
                "scissors"
        };
        for(String option : optionsToAdd){
            options.add(option);
        }

    }

    private void getOption(){
        Random rand = new Random();
        int arraySize = options.size();
        int index = rand.nextInt(arraySize);
        randomGen = getOptionAtIndex(index);
    }

    public String getOptionAtIndex(int index) {
        return options.get(index);
    }

    public String play(){
        getOption();
        return matchup() + " \n You chose: " + playerChoice + " \n Computer chose: " + randomGen;
    }
}
