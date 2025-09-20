import java.util.Arrays;
public class swapdemo {
    public static void main(String[] args) {
        int arr[]={1,5,3,53,2,9};
        int start=0;
        int end =arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
        
        static void swap(int arr[],int start,int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }


