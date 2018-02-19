public class Solution {
    /*
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> result = new ArrayList<String>();
        int i = 1;
        
        while(i <= n){
            if(i%15 == 0){
                result.add("fizz buzz");
            }else if(i%5 == 0){
                result.add("buzz");
            }else if(i%3 == 0){
                result.add("fizz");
            }else{
                result.add(String.valueOf(i));
            }
            
            i++;
        }
        
        return result;
    }
}