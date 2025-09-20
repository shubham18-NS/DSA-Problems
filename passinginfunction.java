import java.util.Arrays;
import java.util.Scanner;
public class passinginfunction {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String [] str1=new String[5];
    for (int i=0;i<str1.length;i++){
        System.out.println("Enter a string:");
        str1[i]=sc.nextLine();
    }
    System.out.println(Arrays.toString(str1));
    tochange(str1);
    System.out.println(Arrays.toString(str1));
}
    static void tochange(String [] str){
        str[0]="shubham";
}
}
