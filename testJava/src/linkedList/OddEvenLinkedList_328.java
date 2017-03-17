package linkedList;

/**
 * Created by chenqingqing on 2017/3/12.
 */
public class OddEvenLinkedList_328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode odd = head,even = head.next,evenHead = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;

    }
}
