public class Solution {
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if(A.length() < B.length()) return false;
        if(B.length() == 0) return true;
        
        int[] count = new int[256];
        for(int i = 0; i < A.length(); i++){
            count[(int)A.charAt(i)]++;
        }
        
        for(int i = 0; i < B.length(); i++){
            count[(int)B.charAt(i)]--;
            if(count[(int)B.charAt(i)] < 0)
                return false;
        }
        
        return true;
    }
}