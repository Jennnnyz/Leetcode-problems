/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param T1: The roots of binary tree T1.
     * @param T2: The roots of binary tree T2.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
        if(T2 == null) return true;
        if(T1 == null) return false;
        
        LinkedList<TreeNode> q1 = new LinkedList<TreeNode>();
        q1.add(T1);
        
        while(q1.size() != 0){
            TreeNode t1 = q1.removeFirst();
            if(isSubtreeRoot(t1, T2)){
                return true;
            }
            else{
                if(t1.left != null)
                    q1.add(t1.left);
                if(t1.right != null)
                    q1.add(t1.right);
            }
        }
        
        return false;
    }
    
    private boolean isSubtreeRoot(TreeNode T1, TreeNode T2){
        
        
        LinkedList<TreeNode> q1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(T1);
        q2.add(T2);
        while(q2.size() != 0){
            TreeNode t1 = q1.removeFirst();
            TreeNode t2 = q2.removeFirst();
            
            if(t1.val != t2.val) return false;
            if(t2.left == null){
                if(t1.left != null) return false;
            }else{
                if(t1.left == null) return false;
                q1.add(t1.left);
                q2.add(t2.left);
            }
            
            if(t2.right == null){
                if(t1.right != null) return false;
            }else{
                if(t1.right == null) return false;
                q1.add(t1.right);
                q2.add(t2.right);
            }
        }
        return true;
    }
}