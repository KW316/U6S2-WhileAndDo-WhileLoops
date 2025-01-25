package partB.ex01;

public class DoWhileLoop2 {
    public static String doWhileLoopTwo(int[] arr){
        String response = "";
        int i = 0;

        do {
            if(arr[i]%2 == 0){
            response += arr[i] + ", ";
            }
            i++;
        }while (i < arr.length);


        return response;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(doWhileLoopTwo(arr));
    }
}
