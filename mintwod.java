import java.util.Arrays;
class minarray{
    public static void main(String[]args){
        int[][]arr={{23,45,56,7,8},{1,2,3},{24,25,26}};
        int target=3;
        int[]ans=search(arr,target);
        System.out.println(arr[ans[0]][ans[1]]);
    }
    static int []search(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
        
    }
    
}