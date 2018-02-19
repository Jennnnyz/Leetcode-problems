public class Solution {
    /**
     * @param nums: An array of integers
     * @return: An integer
     */
    public int findMissing(int[] nums) {
        // write your code here
        
        int[] allNums = new int[nums.length+1];
        
        for(int i = 0; i <= nums.length; i++){
            allNums[i] = i;
        }
        
        System.out.println(Arrays.toString(allNums));
        
        int result = 0;
        
        for(int i = 0; i < nums.length; i++){
            result ^= (nums[i] ^ allNums[i]);
        }
        
        result ^= allNums[nums.length];
        
        return result;
    }
}