// java pattern question
// how to approch this type of problem
//Step1:no of lines=no of rows=no of times the for loop will run
//Step2:Identify the row number
//i)how many coloumns are there
//ii)Types of element in column
//step3)what we need to print
class pattern2{
    public static void main(String[] args) {
        int n=5;
        pattern2(n);
        
    }
    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
//output:
   * * * * *
   * * * * *
   * * * * *
   * * * * *
   * * * * *
