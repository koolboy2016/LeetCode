/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int minDepth(TreeNode* root) {
        
        if (root == NULL)
            return 0;
        
        if(root->left == NULL && root->right == NULL){
            return 1;
        }
        
        int leftDepth, rightDepth;
        
        if (root->left == NULL)
            return minDepth(root->right) + 1;
            
        if (root->right == NULL)
            return minDepth(root->left) + 1;
        
     
        leftDepth = minDepth(root->left);
        rightDepth = minDepth(root->right);
        if (leftDepth <= rightDepth)    
            return leftDepth + 1;
        else
            return rightDepth + 1;
    
        
        
            
        
    }
};
