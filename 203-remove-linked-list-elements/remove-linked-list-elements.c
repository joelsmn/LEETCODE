/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* prev=NULL;
    struct ListNode* temp=head;

    while(temp!=NULL){
        if(temp->val==val){
            if(prev==NULL){
                head=temp->next;
                free(temp);
                temp=head;
            }
            else{
                prev->next=temp->next;
                free(temp);
                temp=prev;
            }
        }
        else{
            prev=temp;
            temp=temp->next;
        }
    }
    return head;

    
}