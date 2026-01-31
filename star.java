// Pattern 4
//numbers pattern
class pattern {
    public static void main(String[] args) {
      numpattern4(5);
    }
    static void numpattern4(int n){
        for(int row=0;row<=2*n-1;row++)
        {
            int count;
            if(row>n){
                count=2*n-row;
            }
            else{
                count=row+1;
            }
            for(int col=1;col<=count;col++){
               System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
//output:
*
**
***
****
*****
******
****
***
**
*
