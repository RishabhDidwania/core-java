package Day01;

/*
*
* * Create Lab02.java with a main method
* Implement the following functions
* __calculateSquare__ takes an array of numbers, squares the values and returns void
* __increment__ takes an array of numbers, and increments each by 1 and does not return anything
* __doubleIt__ takes an array of numbers and doubles each and returns void

* Print the result finally

* Here's the sample output

```
Enter number I
3
Enter number II
5
Enter number III
10

***squaring (3, 5, 10)
***incrementing  (9, 25, 100)
***doubling (10, 26, 101)

Output of [3, 5, 10] ->  20, 52, 202
```*/

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {

        int [] numbers = new int[3];
        populateNumbers(numbers);

        calculateSquare(numbers);
        printNumbers("Squaring..",numbers);

        __increment__(numbers);
        printNumbers("__increment__..", numbers);

        __doubleIt__(numbers);
        printNumbers("__doubleIt__..",numbers);

    }

    private static void printNumbers(String s, int[] numbers) {
        System.out.println(s);
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    private static void populateNumbers(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        for(int m = 0; m < numbers.length; m++ ){
            System.out.println("Enter number " + (m+1)  );
            numbers[m] = scanner.nextInt();
        }
    }

    static void calculateSquare(int[] arr){
        for(int m = 0 ; m < arr.length; m++ ){
           arr[m] = arr[m] * arr[m];
        }
    }
    static void __increment__(int[] arr){
        for(int m = 0 ; m < arr.length; m++ ){
            arr[m] = arr[m] + 1;
        }
    }
    static void __doubleIt__(int[] arr){
        for(int m = 0 ; m < arr.length; m++ ){
            arr[m] = arr[m] * 2;
        }
    }
}
