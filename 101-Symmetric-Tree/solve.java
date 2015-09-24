/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if (root == null)
            return true;
        if (root.left != null && root.right == null)
            return false;
        if (root.left == null && root.right != null)
            return false;
            
        return isSame(root.left, root.right);
        
    }
    
    public boolean isSame(TreeNode left, TreeNode right){
        
        if (left == null && right == null)
            return true;
        if (left == null && right != null)
            return false;
        if (left != null && right == null)
            return false;
        if (left.val != right.val)
            return false;
        
        boolean one = isSame(left.right, right.left);
        if (one != true)
            return false;
        
        boolean two = isSame(left.left, right.right);
        if (two != true)
            return false;
        
        return true;
        
    }
}
