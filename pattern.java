// java pattern question
// how to approch this type of problem
//Step1:no of lines=no of rows=no of times the for loop will run
//Step2:Identify the row number
//i)how many coloumns are there
//ii)Types of element in column
//step3)what we need to print
class pattern{
    public static void main(String[] args) {
        int n=5;
        pattern1(n);
        
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
