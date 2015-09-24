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
    List<String> res = new ArrayList<String>();
    
    public List<String> binaryTreePaths(TreeNode root) {
    
        if (root == null)
            return res;
        
        StringBuilder sb = new StringBuilder();
        getPaths(root, res, sb);
    
        return res;
        
    }
    
    public void getPaths(TreeNode root, List<String> res, StringBuilder sb){
        
        if( root.left == null && root.right == null){
            
            sb.append(root.val);
            res.add(sb.toString());
            return ;
        }
     
        sb.append(root.val);
        sb.append("->");
        int length = sb.length();
            
        if (root.left != null){
            
            getPaths(root.left, res, sb);
            
        }
        sb.setLength(length);
        
        if (root.right != null){

            getPaths(root.right, res, sb);            
        }
     
        
    }
    
        
}
