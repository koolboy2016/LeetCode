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
    bool isSameTree(TreeNode* p, TreeNode* q) {
        
        if ( p == NULL && q == NULL )
            return true;
        if ( p == NULL && q != NULL )
            return false;
        if ( p != NULL && q == NULL )
            return false;
            
        if ( p->val != q->val )
            return false;
    
        bool leftResult = isSameTree(p->left, q->left);
        if (!leftResult)
            return false;
        
        bool rightResult = isSameTree(p->right, q->right);
        if ( !rightResult )
            return false;
        
        return true;
        
    }
};
