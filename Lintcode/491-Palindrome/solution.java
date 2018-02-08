public class Solution {
    /*
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        String numString = Integer.toString(num);
        int start = 0;
        int end = numString.length() - 1;
        if(end%2 == 0){
            while(start != end){
                if(numString.charAt(start) != numString.charAt(end))
                    return false;
                start++;
                end--;
            }
        }else{
            while(start != (end-1)){
                if(numString.charAt(start) != numString.charAt(end))
                    return false;
                start++;
                end--;
            }
        }
        
        return numString.charAt(start) == numString.charAt(end);
    }
}