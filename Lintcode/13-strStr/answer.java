public class Solution {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
        // write your code here
        if(source == null || target == null)
            return -1;
            
        int tsize = target.length();
        int ssize = source.length();
        
        if(tsize > ssize)
            return -1;
            
        int start = 0;
        int end = tsize;
        
        while(end <= ssize){
            String substring = source.substring(start, end);
            if(substring.equals(target)){
                return start;
            }
            start++;
            end++;
        }
        
        return -1;
    }
}