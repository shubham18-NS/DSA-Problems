// Pattern 3
class pattern {
    public static void main(String[] args) {
      pattern3(4);
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++)
        {
            for(int col=n;col>=row;col--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
//ouput:
 *  *  *  * 
 *  *  * 
 *  * 
 * 
