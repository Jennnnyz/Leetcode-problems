public class Solution {
    /*
     * @param words: A list of words
     * @return: Return how many different rotate words
     */
    public int countRotateWords(List<String> words) {
        // Write your code here
        List<String> singlewords = new ArrayList<String>();
        for(int i = 0; i < words.size(); i++){
            String current = words.get(i);
            String currentDup = current + current;
            boolean isRotate = false;
            for(int j = 0; j < singlewords.size(); j++){
                String currentSingle = singlewords.get(j);
                if(currentDup.contains(currentSingle) && (currentDup.length()) == (2 * currentSingle.length())){
                    isRotate = true;
                    break;
                }
            }
            if(!isRotate)
                singlewords.add(current);
        }
        return singlewords.size();
    }
}