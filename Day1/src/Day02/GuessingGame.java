package Day02;

import java.util.Scanner;

public class GuessingGame {
    int gussedInt ;
    Integer rnadInt ;
    Integer guessCount ;
    //System.out.println("Welcome to the Guessing Game. Enter a number between 1 and 100.");

    GuessingGame(){
        rnadInt = (int)(Math.random() * 100) ;
        guessCount = 0;
        gussedInt = -1;
    }


//        System.out.println("You've got it in " + guessCount + "attempts");

    int validateInput(int input){
            while(rnadInt != gussedInt){
                gussedInt = input;
                guessCount = guessCount +1;
                if(gussedInt < rnadInt){
                    return 1; //System.out.println("Aim Higher ");
                }else if(gussedInt > rnadInt){
                    return -1; //System.out.println("Aim Lower ");
                }
            };
            return 0;
        }

}
