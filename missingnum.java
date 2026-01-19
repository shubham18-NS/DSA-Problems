//question try to find element 0...n try to find missing elment in array 
import java.util.Arrays;
class missingnum{
    public static void main(String[]args){
        System.out.println("FINDING MISSING NUMBER IN ARRAY");
        int []arr={2,3,0,4};
        int index=missingnumber(arr);
        System.out.println(index);
        
    }
    static int missingnumber(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[correct]){
               swap(arr,i,correct);
            }else{
                i++;
            }
            for(int index=0;index<arr.length;index++){
                if(index!=arr[index]){
                    return index;
                }
            }
        }
         return arr.length;
    }
    static void swap(int[]arr,int first,int secoend){
        int temp=arr[first];
        arr[first]=arr[secoend];
        arr[secoend]=temp;
        
    }
}
//output:
FINDING MISSING NUMBER IN ARRAY
1
