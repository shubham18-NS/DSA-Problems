public class palindrome {
    public static void main(String[] args) {
    int n=12345;
    int rem;
    int ans=0;
    while(n>0){
        rem=n%10;
        n=n/10;
        ans=ans*10+rem;
    }
    System.out.println(ans);

    }
}
