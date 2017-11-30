public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Hashtable ht = new Hashtable();
        for(int i = 0; i < nums.Length; i++){
             int num = nums[i];
             int complement = target - num;
                if(ht.ContainsKey(complement)){
                    return new int[]{(int)ht[complement], i};
                }
                  ht[num] = i;
            }
        return new int[]{};
    }
}