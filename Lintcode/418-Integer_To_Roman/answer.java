public class Solution {
    /**
     * @param n: The integer
     * @return: Roman representation
     */
    public String intToRoman(int n) {
        // write your code here
        String digit1[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String digit2[] = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String digit3[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String digit4[] = {"", "M", "MM", "MMM"};
        
        String answer = digit4[n/1000%10]+digit3[n/100%10]+digit2[n/10%10]+digit1[n%10];
        return answer;
    }
}