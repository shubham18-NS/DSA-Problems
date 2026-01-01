
/*A matrix is given in rowwise and coloumnwise manner find out the element 37(hint:minimize the matrix) */
import java.util.Arrays;
class matrix2d {
public static void main(String args[]){
    int arr[][]={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
    System.out.println(Arrays.toString(matrixsearch(arr,39)));
}

static int[]matrixsearch(int[][]matrix,int target){
    int row=0;
    int coloumn=matrix.length-1;
    while(row<matrix.length && coloumn>=0){
        if(matrix[row][coloumn]==target){
            return new int[]{row,coloumn};
        }
        else if(matrix[row][coloumn]>target){
            coloumn--;
        }
        else{
            row++;
        }
    }
    return new int[]{-1,-1};
}
}