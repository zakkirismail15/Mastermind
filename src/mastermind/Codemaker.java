/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Codemaker {

    private static int[] code;  //This instance use to store generated code
    private static int[] guess; //This instance use to store answer from player to be check
    private static int[] result = new int[2]; //This instance is to calculate BLACK for result[0] and WHITE for result[1]
    private static boolean[] used; // This instance is checking the each colour whether it is exist as single or more in a code,by default all boolean is set to false
    protected static int chances = 0;
    Game feedb = new Game();

    public Codemaker() {

    }

    public void ResetChances() {
        chances = 0;
    }

    public Codemaker(int mode) { // This  constructor receive the number of code that user desire to guess
        this.code = new int[mode];
        this.guess = new int[mode];
        this.used = new boolean[mode];
    }

    public Codemaker(int i, int guess) { //This constructor help to receive the guess from the player, there is no loop for this guess array to ease player to change the idea.
        this.guess[i] = guess;
    }
    
    public int[] getCode(){
        return code;
    }
    
        public int getChances() { // To synchronize both instance variable "chances" in both class
        return chances;
    }

    public static void Generator() { // To generate random colour for code. Each code represent a colour.
        Random r = new Random();
        //RED = 0
        //GREEN = 1
        //BLUE = 2
        //YELLOW = 3
        //ORANGE = 4
        //PINK = 5
        //PURPLE = 6
        //TEAL = 7
        code[0] = r.nextInt(8);
        for (int i = 1; i < code.length; i++) {
            code[i] = r.nextInt(8);
            for (int j = 0; j < i; j++) {
            }
        }
        for (int i = 0; i < code.length; i++) {
            System.out.println(code[i]);
        }
        for (int i = 0; i < code.length; i++) {
            guess[i] = -1;
        }
    }

    public boolean checkBlank() { //This method is to make sure that all the guess has an input
        boolean blank = false;
        for (int i = 0; i < code.length; i++) {
            if (chances == -1) {
                break;
            }
            if (guess[i] == -1 && chances <= 7) {
                JOptionPane.showMessageDialog(null, "PLEASE FILL ALL THE BLANK");
                blank = true;
                break;

            }

        }
        return blank;
    }

    public boolean checkGuess() { // To compare the colour between guess from Codebreaker with Codemaker
        Score score = new Score();
        boolean end = false;
        for (int i = 0; i < code.length; i++) {
            if (guess[i] == code[i]) {
                result[0]++;            // When guess[i]== code[i], BLACK hint is increase by one which mean the colour and the place is true.
            } else {
                for (int j = 0; j < code.length; j++) {
                    if (guess[i] == code[j] && guess[j] != code[j] && !used[j]) { //When all this condition is satisfied WHITE hint is increase by one which mean the colour is exist but the place is wrong
                        used[j] = true; //When this is set to 'true' the guess colour will pair with actual code
                        result[1]++;
                        break;
                    }
                }
            }
        }

        if (result[0] == code.length) {
            feedb.setFeed(result);
            end = true;
            Game endgame = new Game(chances);
        } else if (chances == 7) {
            feedb.setFeed(result);
            Game endgame = new Game(chances);
        } else {
            feedb.setFeed(result);
            chances++;
        }
        return end;
    }



    public void Resetter() { //To reset the variables for the next guess
        for (int i = 0; i < code.length; i++) {
            guess[i] = -1;
            result[0] = 0;
            result[1] = 0;
            used[i] = false;

        }
    }

}
