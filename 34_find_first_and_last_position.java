class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            firstocc(nums , target),lastocc(nums,target)
        };
    }
    int firstocc(int[] nums , int target){
        int low = 0 , high = nums.length - 1;
        
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= target){
                if(nums[mid] == target) ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }  
        return ans;   
    }
    int lastocc(int []nums , int target){
        int low = 0 , high = nums.length -1, ans = -1;

        while(low <= high){
            int mid = low + (high- low)/2;
            if(nums[mid] <= target){
                if(nums[mid] == target) ans = mid;
                low = mid + 1;
            }
            else{
                high = mid- 1;
            }
    
        }
        return ans;
    }
}