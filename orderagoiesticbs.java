

class orderAgnosticbs {
    boolean isAce(int arr[], int start, int end) {
        if (arr[start] < arr[end]) {
            isAce=true;
        } else{
            isAce=false;
        }
     public static int orderAgnosticbs(int arr[],int target){
             }
     int start = 0;
     int end = arr.length - 1;
      if (isAce==true){
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;  // target found at index mid
            }
        }
      else{
           while (start >= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
             end = mid - 1;
            } else if (target > arr[mid]) {
               end = mid - 1;
            } else {
                return mid;  // target found at index mid
            }
        }
          
            
        }
        return -1;  // target not found
    }
}
    }
}
   
