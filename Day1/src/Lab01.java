import java.util.Scanner;


/*
* * Create Lab01.java file with a main method
* Implement a guessing game application, where user plays till she guesses a generated random number correct.
* The application generates a random number between 1 and 100. And the user plays till she guesses the number correct
* Here's a sample behavior of the program

* Say 77 is the random number generated

```
Welcome to the Guessing Game. Enter a number between 1 and 100.*
50
Aim Higher
90
Aim Lower
80
Aim Lower
77
You've got it in 4 attempts !!!.

```
* */
public class Lab01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game. Enter a number between 1 and 100.");
        Integer rnadInt = (int)(Math.random() * 100) ;
        Integer guessCount = 0;
        Integer gussedInt = -1;
        while(rnadInt != gussedInt){
            gussedInt = scanner.nextInt();
            guessCount = guessCount +1;
            if(gussedInt < rnadInt){
                System.out.println("Aim Higher ");
            }else if(gussedInt > rnadInt){
                System.out.println("Aim Lower ");
            }
        }
        System.out.println("You've got it in " + guessCount + "attempts");
    }
}
