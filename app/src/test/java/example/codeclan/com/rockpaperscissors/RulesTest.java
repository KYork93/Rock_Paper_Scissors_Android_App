package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 18/01/2017.
 */

public class RulesTest {

    private Rules rules;

    @Before
    public void before(){
        rules = new Rules("rock");
    }

    @Test
    public void canPaperWin(){
        rules.randomGen = "paper";
        assertEquals("You lose!", rules.matchup());
    }

    @Test
    public void canPlayerWin(){
        Rules rules = new Rules("scissors");
        rules.randomGen = "paper";
        assertEquals("You win!", rules.matchup());
    }

    @Test
    public void canDraw(){
        Rules rules = new Rules("scissors");
        rules.randomGen = "scissors";
        rules.getOptionAtIndex(2);
        assertEquals("Draw", rules.matchup());
    }

    @Test
    public void canGetAtIndex(){
        assertEquals("rock", rules.getOptionAtIndex(0));
    }
}
