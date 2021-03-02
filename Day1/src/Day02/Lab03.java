package Day02;

import com.sun.codemodel.internal.JForEach;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
* * Create Lab03.java with a main
* You have String input like this

``` java
String input1 = "+5 -1 +9 +5 -7 +5 -3 +2 -4 +6 +8"
```

* Compute the value by parsing input1
* Visit https://docs.oracle.com/javase/9/docs/api/java/lang/String.html	and read about the __split__, __charAt__, __trim__ methods and use them
* Use __Integer.parseInt()__ to parse a string to int


* Have another input variable like this

``` java
String input2 = "p5 m1 p9 p5 m7 p5 m3 p2 m4 p6 p8"
```

* Compute the value by parsing input2
* Split the application into smaller methods and implement
* */
public class Lab03 {
    public static void main(String[] args) {
        String input1 = "+5 -1 +9 +5 -7 +5 -3 +2 -4 +6 +8";
        String[] inputStringArr = input1.split(" ");
        int computedValue1 = 0;
        for(String s: inputStringArr){
            computedValue1 = computedValue1 + Integer.parseInt(s);
        }
        System.out.println(computedValue1);




        String input2 = "p5 m1 p9 p5 m7 p5 m3 p2 m4 p6 p8";
        String[] inputStringArr2 = input2.split(" ");
        int computedValue2 = 0;
        for(String s: inputStringArr2){
            char op = s.charAt(0);
            int sbuStringInt = Integer.parseInt(s.substring(1));
            computedValue2 += op == 'p' ? sbuStringInt : -sbuStringInt;
        }
        System.out.println(computedValue2);

    }
}
