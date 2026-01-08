//Example of switch case
import java.util.Scanner;
public class CaseExample {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.mango\n2.greyps\n3.apple");
        String fruits=sc.next();
        switch(fruits){
            case "mango" -> System.out.println("king of fruits");
            case"apple" -> System.out.println("sweet apple");
        }


    }
}
//output:2 -sweet apple

