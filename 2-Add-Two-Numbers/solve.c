/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        if(l1 == NULL && l2 == NULL)  
            return NULL;
        
        ListNode* head = new ListNode(-1);
        ListNode* l3 = head;
        int flag = 0;
        int sum;
        while(l1 != NULL && l2 != NULL){
            
            sum = l1->val + l2->val;
            if (flag == 1){
                sum += 1;
                flag = 0;
            }
            if (sum >= 10){
                sum = sum - 10;
                flag = 1;
            }
            ListNode* tmp = new ListNode(sum);
            l3->next = tmp;
            l3 = tmp;
            l1 = l1->next;
            l2 = l2->next;
        }
        
        while(l1 != NULL){
            sum = l1->val;
            if (flag == 1){
                sum = sum + 1;
                flag = 0;
                if (sum >= 10){
                    sum = sum - 10;
                    flag = 1;
                }
            }
            
            ListNode* tmp = new ListNode(sum);
            l3->next = tmp;
            l3 = tmp;
            l1 = l1->next;
        }
        
        while(l2 != NULL){
            sum = l2->val;
            if (flag == 1){
                sum = sum + 1;
                flag = 0;
                if (sum >= 10){
                    sum = sum - 10;
                    flag = 1;
                }
            }
            
            ListNode* tmp = new ListNode(sum);
            l3->next = tmp;
            l3 = tmp;
            l2 = l2->next;
        }
        
        if (flag == 1){
            ListNode* tmp = new ListNode(1);
            l3->next = tmp;
        }
        return head->next;
    }
};
