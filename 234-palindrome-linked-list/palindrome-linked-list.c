/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* reverse(struct ListNode* start,struct ListNode* end){
    struct ListNode* prev=NULL;
    struct ListNode* nex=NULL;
    struct ListNode* curr=start->next;

    while(curr!=NULL){
        nex=curr->next;
        curr->next=prev;
        prev=curr;
        curr=nex;
    }
    return prev;
}

bool isPalindrome(struct ListNode* head) {
    if(head==NULL) return true;

    struct ListNode* slow=head;
    struct ListNode* fast=head;

    while(fast->next!=NULL && fast->next->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }

    struct ListNode* second=reverse(slow,fast);
    struct ListNode* first=head;

    while(second!=NULL){
        if(first->val!=second->val){
            return false;
        }
        first=first->next;
        second=second->next;
    }
    return true;

}