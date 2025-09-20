class ceilfind{
    public static void main(String args[]){
        int arr[]={1,2,34,35,40};
        int target=32;
        int ceil=ceiling(arr,target);
        System.out.println(ceil);
    }
    static int ceiling(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        if(target==mid){
            System.out.println(mid);
        }else{
            start=mid+1;
            for(int i=0;i<=target;i++){
                int min=arr[0];
                while(min>arr[i]){
                    System.out.println(min);
                }
            }
        }
        return -1;
    }
}