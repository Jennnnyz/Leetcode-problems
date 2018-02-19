class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        if(nums == null || nums.length == 0)
            return -1;
            
        int size = nums.length;
        int start = 0;
        int end = size - 1;
        
        while(start + 1 < end){
            int mid = (start + end) >> 1;
            if(nums[mid] < target){
                start = mid;
            }else if(nums[mid] > target){
                end = mid;
            }else{
                if(mid > 0){
                    if(nums[mid-1] == target){
                        end = mid;
                    }else{
                        return mid;
                    }
                }else{
                    return mid;
                }
            }
        }

        if(nums[start] == target) return start;
        
        return -1;
    }
}