public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        int carry;
        while(b != 0){
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        
        return a;
    }
}