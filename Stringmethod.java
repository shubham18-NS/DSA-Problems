//String methods
import java.util.Arrays;
class Stringmethod{
    public static void main(String[]args){
        String name="SHUBHAM NAIKWADE kumar sanu";
        System.out.println(Arrays.toString(name.toCharArray()));//out:[S, H, U, B, H, A, M,  , N, A, I, K, W, A, D, E]
        name.toLowerCase();
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('n'));
        System.out.println("  shubham  ".strip());//out:shubham
        System.out.println(Arrays.toString(name.split("")));
    }
}
