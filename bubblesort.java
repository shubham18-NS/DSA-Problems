import java.util.Arrays;
class bubblesort{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int []arr){
        boolean swapped;
        //for loop taking steps till nth times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //taking jth loop for sorting array every pass the element goes in last index
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            //if elements are not swapped then this condition will be run
            if  (!swapped==true){
                System.out.println("Element are not swapped");
                break;
            }
        }
    }
}
