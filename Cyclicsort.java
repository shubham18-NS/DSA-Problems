// Cyclic Sort 
import java.util.Arrays;
class Cyclicsort{
    public static void main(String[]args){
        System.out.println("CYCLIC SORT");
        int []arr={3,2,4,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void cyclic(int[]arr){
    int i=0;
    while(i<arr.length){
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }else{
            i++;
        }
    }
    }
    static void swap(int[]arr,int first,int secoend){
        int temp=arr[first];
        arr[first]=arr[secoend];
        arr[secoend]=temp;
    }
}
//output
//CYCLIC SORT
[1, 2, 3, 4]
