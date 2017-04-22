import linkedList.ListNode;

/**
 * Created by chenqingqing on 2017/4/15.
 */
public class InsertionSortList_147 {
    ListNode searchForInsertPos(ListNode head, ListNode cur) {
        ListNode pre  = head;
        ListNode next = head.next;
        while( next!=null && next.val<=cur.val) {
            pre  = next;
            next = next.next;
        }
        return pre;
    }

    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);//排序后的链表头节点
        dummy.next = null;
        ListNode new_next;
        ListNode pre,next;
        //ListNode iter = head;
        while(head!=null) {
            next = head.next;
            pre  = searchForInsertPos(dummy,head);
            new_next = pre.next;
            head.next = new_next;
            pre.next  = head;
            head = next;
        }
        return dummy.next;
    }
}
