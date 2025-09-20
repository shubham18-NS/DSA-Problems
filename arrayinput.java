import java.util.Arrays;
import java.util.Scanner;
public class arrayinput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String [] str1=new String[5];
        for(int i=0;i<str1.length;i++){
            System.out.print("Enter a string:");
            str1[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(str1));
        str1[0]="ram";
        System.out.println(Arrays.toString(str1));
    }
    
}
