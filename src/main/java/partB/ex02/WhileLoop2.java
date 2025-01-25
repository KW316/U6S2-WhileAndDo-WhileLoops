package partB.ex02;
import java.util.Scanner;
public class WhileLoop2 {
    public static String whileLoopTwo(int x){
        String response = "";
        int i = 0;
        while(i < x){
            System.out.println("The current Number is :" + i);
            i++;
        }

        System.out.println("We are done");
        return response;
    }

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number to count :");
        int x = keyboard.nextInt();
        whileLoopTwo(x);


    }
}
