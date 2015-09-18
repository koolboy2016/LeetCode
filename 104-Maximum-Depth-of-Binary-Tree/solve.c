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
    int maxDepth(TreeNode* root) {
        
        if (root == NULL)
            return 0;
        
        if(root->left == NULL && root->right == NULL){
            return 1;
        }
        
        int leftDepth, rightDepth;
        if(root->left == NULL)
            leftDepth = 0;
        else
            leftDepth = maxDepth(root->left);
        
        if(root->right == NULL)
            rightDepth = 0;
        else
            rightDepth = maxDepth(root->right);
        
        if (leftDepth >= rightDepth)
            return leftDepth + 1;
        else
            return rightDepth + 1; 
            
        
        
        
        
    }
};
