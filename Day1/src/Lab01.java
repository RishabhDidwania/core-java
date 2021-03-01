import java.util.Scanner;

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
