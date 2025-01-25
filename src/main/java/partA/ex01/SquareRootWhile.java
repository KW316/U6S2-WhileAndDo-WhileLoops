package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot(int x){
        String response = "";
            response = "The square root of " + x + " is " + Math.sqrt(x);
        return response;
    }
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a non-negative integer");
        int x = keyboard.nextInt();
        while (x < 0){
            System.out.println("Invalid Number, try again:");
            x = keyboard.nextInt();
        }
        System.out.println(squareRoot(x));

    }
}
