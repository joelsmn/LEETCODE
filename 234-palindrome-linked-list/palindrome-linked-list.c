/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

// struct ListNode* reverse(struct ListNode* head){
//     struct ListNode* prev=NULL;
//     struct ListNode* nex=NULL;
//     struct ListNode* curr=head;

//     while(curr!=NULL){
//         nex=curr->next;
//         curr->next=prev;
//         curr=nex;
//         prev=curr;
//     }
//     return prev;
// }

bool isPalindrome(struct ListNode* head) {
    if(head==NULL) return false;

    struct ListNode* temp=head;
    int count=0;
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    //printf("%d\n",count);
    int arr[count],k=0;

    temp=head;
    while(temp!=NULL){
        arr[k++]=temp->val;
        temp=temp->next;
    }

    // for(int i=0;i<count;i++){
    //     printf("%d ",arr[i]);
    // }
    
    int j=count-1,i=0;

    while(i<j){
        if(arr[i]!=arr[j]){
            return false;
        }
        i++;j--;
    }

    return true;



}