import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1st no:");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd no:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("sum is- "+sum);

        
    }
}
