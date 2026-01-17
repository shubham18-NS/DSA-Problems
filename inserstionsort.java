//Inserstion sort//
import java.util.Arrays;
class Inserstion{
    public static void main(String[]args){
        int[] arr={3,4,5,-2,3,6};
        System.out.println("INSERTION SORT");
        inserstionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void inserstionsort(int[] arr){
        int n=arr.length;
        //we are comparing  till n-2 element 
        for(int i=1;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                break;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int secoend){
        int temp=arr[first];
        arr[first]=arr[secoend];
        arr[secoend]=temp;
    }
}
