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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        inverttree(root);
        return root;
    }
    public void inverttree(TreeNode root){
        if(root == null)
            return ;
        TreeNode temp = root.left ;
        root.left = root.right ;
        root.right = temp;
        
        inverttree(root.left);
        inverttree(root.right);
    }
}