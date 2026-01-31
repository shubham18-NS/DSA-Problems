// Pattern 4
//numbers pattern
class pattern {
    public static void main(String[] args) {
      numpattern4(5);
    }
    static void numpattern4(int n){
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
//output:
1
12
123
1234
12345
