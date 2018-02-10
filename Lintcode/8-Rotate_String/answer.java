public class Solution {
    /*
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if(str == null)
            return;
            
        int size = str.length;
        if(size == 0)
            return;
            
        offset = offset%size;
        
        reverse(str, 0, size-1-offset);
        reverse(str, size-offset, size-1);
        reverse(str, 0, size-1);
    }
    
    private void reverse(char[] str, int start, int end){
        for(int i = start, j = end; i < j; i++, j--){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }
}