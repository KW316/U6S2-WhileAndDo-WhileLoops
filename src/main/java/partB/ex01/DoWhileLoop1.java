package partB.ex01;

public class DoWhileLoop1 {
    public static String doWhileLoopOne(int[] arr){
        String response = "";
        int i = 0;
        do {
            response += arr[i] + ", ";
            i++;
        }while (i < arr.length);


        return response;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(doWhileLoopOne(arr));
    }
}
