/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    int c=0;
    struct ListNode* temp=head;

    while(temp!=NULL){
        c++;
        temp=temp->next;
    }
    c/=2;
    temp=head;
    while(c--){
        temp=temp->next;
    }
    head=temp;
    return head;


}