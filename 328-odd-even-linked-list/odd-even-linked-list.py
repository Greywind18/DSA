# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
         odd = head
         even = head
         store = head
         temp = head
         if(head is None or head.next is None or head.next.next is None):
            return head
        
         while(odd.next.next is not None or store.next.next is not None):
            odd = odd.next.next
            if(store==head):
                store = temp.next
                even = store
            else:
                store.next = temp.next
            
            store = temp.next
            temp.next = odd
            temp = odd
            if(temp.next is None):
                temp.next = even
                store.next = None
                break
            elif(temp.next.next is None):
                store.next = temp.next
                store = temp.next
                temp.next = even
                store.next = None
                break


         return head   



        