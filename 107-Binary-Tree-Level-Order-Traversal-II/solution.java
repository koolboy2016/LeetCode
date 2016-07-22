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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;
        List<TreeNode> nodeQueue = new ArrayList<TreeNode>();
        nodeQueue.add(root);
        int currentIndex = 0;
        int nextRowIndex = 1;
        while(currentIndex < nodeQueue.size()){
            
            int newadd = 0 ;
            List<Integer> temp = new ArrayList<Integer>();
            while(currentIndex < nextRowIndex){
                TreeNode tempnode = nodeQueue.get(currentIndex);
                temp.add(tempnode.val);
                if(tempnode.left != null){
                    nodeQueue.add(tempnode.left);
                    newadd ++;
                }
                if(tempnode.right != null){
                    nodeQueue.add(tempnode.right);
                    newadd ++;
                }
                currentIndex ++;
            }
            nextRowIndex += newadd;
            result.add(0,temp);
        }
        return result;
    }
}