package partC;
import java.util.Scanner;
public class AlgoChallenge {
    public static void main(String[] args) {
        System.out.println(checkPosOrNeg(1, -1, false));
        System.out.println(checkPosOrNeg(-1, 1, false));
        System.out.println(checkPosOrNeg(-4, -5, true));
        System.out.println(exchange("code"));
        System.out.println(exchange("a"));
        System.out.println(exchange("ab"));
    }
    /* Problem 1
    Looking at your math worksheet, your given 2 number values of either positive or negative.
    Evaluate a problem and find out if one of those numbers is positive and the other is negative.

    Return true if one is negative and one is positive.

    An exception to this is if the parameter "negative" is true, then only return true if both are negative.

    Example:
    checkPosOrNeg(1, -1, false) --> true
    checkPosOrNeg(-1, 1, false) --> true
    checkPosOrNeg(-4, -5, true) --> true
     */

    public static Boolean checkPosOrNeg(int a, int b, boolean negative) {
            if(a * b < 0){
                return true;
            }else if(a > 0 && b > 0){
                return false;
            }else if(a * b > 0 && negative == true){
                return true;
            }
        return false;
    }


    /* Problem 2
    With the provided string, you need to exchange the first and last characters to create a new string.

    Return the new string.

    Example:
    exchange("code") --> "eodc
    exchange("a") --> "a"
    exchange("ab") --> "ba"
     */

    public static String exchange(String str) {
        String x = "";
        if(str.length() > 2) {
             x = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }else if(str.length() == 2){
            x = str.substring(str.length()-1)+str.substring(0,1);
        }else{
            x = str;
        }
        return x;
    }

}
