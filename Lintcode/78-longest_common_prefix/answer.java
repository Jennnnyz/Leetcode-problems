public class Solution {
    /*
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if(strs.length <= 0) return "";
        String answer = strs[0];
        
        for(int i = 1; i < strs.length; i++){
            answer = longestPrefix(answer, strs[i]);
        }
        
        return answer;
    }
    
    private String longestPrefix(String s1, String s2){
        
        int length = (s1.length() < s2.length()) ? s1.length() : s2.length();
        
        if(length == 0) return "";
        
        int start = 0;
        int end = -1;
        
        for(int i = 0; i < length; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                end = i;
            }else{
                break;
            }
        }
        
        return s1.substring(start, end+1);
    }
}