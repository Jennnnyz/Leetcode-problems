public class Solution {
    /*
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        boolean[] skip = new boolean[strs.length];
        List<String> result = new ArrayList<String>();
        
        for(int i = 0; i < strs.length - 1; i++){
            if(skip[i]) continue;
            for(int j = i+1; j < strs.length; j++){
                if(skip[j]) continue;
                if(isAnagram(strs[i], strs[j])){
                    result.add(strs[j]);
                    skip[i] = true;
                    skip[j] = true;
                }
            }
            if(skip[i])
                result.add(strs[i]);
        }
        
        return result;
    }
    
    private boolean isAnagram(String s1, String s2){
        if(s1 == null && s2 == null) return true;
        if(s1.length() != s2.length()) return false;
        if(s1 == null || s2 == null) return false;

        int[] count = new int[256];
        
        for(int i = 0; i < s1.length(); i++){
            count[(int)s1.charAt(i)]++;
        }
        
        for(int i = 0; i < s2.length(); i++){
            count[(int)s2.charAt(i)]--;
            if(count[(int)s2.charAt(i)] < 0)
                return false;
        }
        
        return true;
    }
}