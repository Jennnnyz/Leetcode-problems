public class Solution {
    /*
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        Arrays.sort(numbers);
        
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        
        int aIndex = 0;
        int bIndex = 1;
        int cIndex = 2;
        int size = numbers.length;
        
        while(aIndex < size - 2){
            int a = numbers[aIndex];
            int b = numbers[bIndex];
            int c = numbers[cIndex];
            
            if((a+b+c) == 0){
                result.add(createList(a,b,c));
            }
            
            if(bIndex == (size-2)){
                aIndex++;
                bIndex = aIndex+1;
                cIndex = bIndex+1;
            }else if(cIndex == (size-1)){
                bIndex++;
                cIndex = bIndex+1;
            }else{
                c++;
            }
        }
        
        return result;
    }
    
    private List<Integer> createList(int a, int b, int c){
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        
        System.out.println(Arrays.toString(list.toArray()));
        return list;
    }
}