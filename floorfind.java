

class floorfind {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,16,17};
        int target=13;
        int ans= flooring(arr,target);
        System.out.println(ans);
    }
    static int flooring(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
