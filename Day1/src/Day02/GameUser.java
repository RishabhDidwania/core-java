package Day02;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class GameUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GuessingGame guessingGame = new GuessingGame();
        boolean gameOver = false;
        int guessCount = 0;
        System.out.println("Welcome to the Guessing Game. Enter a number between 1 and 100.");
        while(gameOver != true){
            int returnedMessage = guessingGame.validateInput(scanner.nextInt());
            guessCount+=1;
            if(returnedMessage<0){
                System.out.println("Aim Lower ");
            }else if(returnedMessage>0){
                System.out.println("Aim Higher ");
            }else{
                gameOver = true;
            }

        }
        System.out.println("You've got it in " + guessCount + "attempts");
        scanner.close();
    }
}
