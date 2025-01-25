package partB.ex02;

public class WhileLoop1 {
    public static String whileLoopOne(){
        String response = "";
        int x = 1;
        while( x < 1001){
            if(x % 2 == 0 ){
                System.out.println( x + " is even");
            }
            x++;
        }

        return response;
    }

    public static void main(String[] args) {
        whileLoopOne();

    }
}
