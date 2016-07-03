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
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int result = getHeight(root);
        if(result == -1)
            return false;
        else
            return true;
    }
    
    public int getHeight(TreeNode root){
        if (root == null)
            return 0;
        
        int leftheight = getHeight(root.left);
        if(leftheight == -1 )
            return -1 ;
        int rightheight = getHeight(root.right);
        if(rightheight == -1)
            return -1 ;
        if(Math.abs(leftheight - rightheight) > 1)
            return -1 ;
        else
            return leftheight > rightheight ? leftheight + 1 : rightheight + 1;
    }
}