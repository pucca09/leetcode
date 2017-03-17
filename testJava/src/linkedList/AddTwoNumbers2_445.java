package linkedList;

/**
 * Created by chenqingqing on 2017/3/12.
 */
public class AddTwoNumbers2_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode p = reverse(l1);
        ListNode q = reverse(l2);
        ListNode newhead = new ListNode(0);
        ListNode pre = newhead;
        int carry = 0;
        while(p != null || q != null || carry != 0){
            ListNode cur = new ListNode(0);
            int pval = (p == null)?0:p.val;
            int qval = (q == null)?0:q.val;
            int sum = carry + pval + qval;
            cur.val = sum%10;
            carry = sum/10;
            pre.next = cur;
            pre = pre.next;
            p = (p== null)?p:p.next;
            q = (q== null)?q:q.next;
        }
        return reverse(newhead.next);

    }
    private ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode pre = null;
        while(head!=null){
            ListNode nextNode = head.next;
            head.next = pre;
            pre = head;
            head = nextNode;
        }
        return pre;
    }
}
