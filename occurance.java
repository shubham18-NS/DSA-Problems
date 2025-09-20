public class occurance{
    public static void main(String []args){
        int n=178776;
        int count =0;
        int rem;
        while(n>0){
            rem=n%10;
            if(rem==7){
                count++;
            }
            n=n/10;
        }
        System.out.println("the 7 occured :"+count);
    }
}