class Solution {
    public int findMin(int[] arr) {
        int low = 0 ;
        int n = arr.length;
        int high = n - 1;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high-low)/2;
        
            if(arr[low] <= arr[mid]){
                if(arr[low] < min){
                    min = arr[low];
                }
                low = mid + 1;
            }
            else{
                if(arr[mid] <= arr[high]){
                    if(arr[mid] < min){
                        min = arr[mid];
                    }
                    high = mid - 1;
                }
            }

        }
      return min;  
    }
}