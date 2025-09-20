//how many numbers contain even number of digits
class evennointeger{
    public static void main(String[]args){
        int nums[]={12,123,1234,12345};
        System.out.println(findnumbers(nums));
    }
    static int digit(int num){
        int count=0;
    
            while(num>0){
                count++;
                num=num/10;
            }
            return count;
    }
    static int findnumbers(int[]nums){
        int count=0;
        for(int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigit=digit(num);
        return numberofdigit%2==0;
    }
}


