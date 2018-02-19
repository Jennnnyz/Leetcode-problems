/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        List<NestedInteger> temp = nestedList;
        boolean isFlat = false;
        
        while(!isFlat){
            isFlat = true;
            List<NestedInteger> newList = new ArrayList<>();
            for(int i = 0; i < temp.size(); i++){
                NestedInteger current = temp.get(i);
                if(current.isInteger()){
                    newList.add(current);
                }else{
                    newList.addAll(current.getList());
                    isFlat = false;
                }
            }
            temp = newList;
        }
        
        for(NestedInteger n : temp){
            result.add(n.getInteger());
        }
        
        return result;
    }
}