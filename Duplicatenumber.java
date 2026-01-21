//Finding Duplicate in a array
//given an array={1,3,4,2,2} we want to find duplicate number in array
//output:2
import java.util.Arrays;
class Duplicatenum{
    public static void main(String[]args){
        int[]arr={1,3,4,2,2};
        int duplicate=duplicatenumber(arr);
        System.out.println(duplicate);
    }
    static int duplicatenumber(int[]arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
             int correct=arr[i]-1;
             if(arr[i]!=arr[correct]){
             swap(arr,i,correct);
             }
            else{
                return arr[i];
             }
        }
        else{
            i++;
        }
   }
   return -1;
  }
    static void swap(int[]arr,int first,int secoend){
        int temp=arr[first];
        arr[first]=arr[secoend];
        arr[secoend]=temp;
    }
}
