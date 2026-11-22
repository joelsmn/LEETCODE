/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

bool isPalindrome(struct ListNode* head) {
    if(head==NULL) return true;

    struct ListNode* temp=head;
    int count=0;
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    int arr[count],k=0;

    temp=head;
    while(temp!=NULL){
        arr[k++]=temp->val;
        temp=temp->next;
    }

    int j=count-1,i=0;

    while(i<j){
        if(arr[i]!=arr[j]){
            return false;
        }
        i++;j--;
    }

    return true;



}