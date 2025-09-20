class linearsearch {
   public static void main(String[] args) {
      int[] nums = {1, 45, 56, 3, 78, 56};
      int ans = linearsearch(nums, 3);
      System.out.println(ans);
   }
   static int linearsearch(int[] arr, int target){
      if (arr.length == 0)
      {
            return -1;
      }
      for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index; // return index where target is found
            }
   }
        return -1; // return -1 if not found
   }
}