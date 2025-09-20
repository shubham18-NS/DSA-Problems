class minarray{
    public static void main(String[]args){
        int[]arr={23,45,56,7,8};
        System.out.println(min(arr));
    }
    static int min(int arr[]){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                return arr[i];
            }
        }
        return ans;
    }
}