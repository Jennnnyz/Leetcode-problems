public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        int size = nums.size();
        Long[] result = new Long[size];

        
        long left = 1;
        
        for(int i = 0; i < size; i++){
            if(i > 0)
                left *= (long) nums.get(i - 1);
            result[i] = left;    
        }
        
        long right = 1;
        
        for(int i = size - 1; i >= 0; i--){
            if(i < size - 1)
                right *= (long) nums.get(i + 1);
            result[i] *= right;
        }
        
        return new ArrayList<Long>(Arrays.asList(result));
    }
}