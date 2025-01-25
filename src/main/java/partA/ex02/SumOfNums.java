package partA.ex02;

import java.util.Scanner;

public class SumOfNums {
    public static String sum(double x){
        String response ="";
        response = "The square root of " + x + " is " + Math.sqrt(x);
        return response;
    }
    public static void main(String args[]) {
        Scanner keyboard = new Scanner( System.in);
        System.out.println("type a number");
        double x = keyboard.nextDouble();
        do {
            System.out.println("Invalid Number: Try Again");
            x = keyboard.nextDouble();
        }while(x < 0);
        System.out.println(sum(x));
    }
}
