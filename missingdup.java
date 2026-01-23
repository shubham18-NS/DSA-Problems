//given a question as we want to find missing number in array and 1number is repeted in array which duplicated in missing number index
//the array is given {1,2,2,4}
//output should be [2,3] in which 2 is duplicate and 3 is missing number
import java.util.Arrays;
import java.util.ArrayList;
class missduplicate{
    public static void main(String[]args){
        int[]arr={1,2,2,4};
        ArrayList<Integer> myNumbers =missingdup(arr);
        System.out.println(myNumbers);
        
    }
    static  ArrayList<Integer>missingdup(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        //here we are finding missing number 
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                result.add(arr[index]);
                result.add(index+1);
                
            }
        }
        return result;
    }
    static void swap(int[]arr,int first,int secoend){
        int temp=arr[first];
        arr[first]=arr[secoend];
        arr[secoend]=temp;
    }
}
