public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        int size = 0;
        
        if(nums == null || nums.length == 0)
            return size;
            
        
        for(int i = 0; i < nums.length; i++){
            if(nums[size] != nums[i]){
                nums[++size] = nums[i];
            }
        }
        
        return size+1;
    }
}