package linkedList;

/**
 * Created by chenqingqing on 2017/3/12.
 */
public class RotateList_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null){
            return head;
        }
        ListNode p = head;
        int len = 0;
        while(p != null){
            p = p.next;
            len++;
        }
        p = head;
        if(k%len == 0){
            return head;
        }else{
            //找到新链表的尾节点
            int k_ = len-k%len;
            while(k_>1){
                p = p.next;
                k_--;
            }
            ListNode newHead = p.next;
            ListNode newTail = p;
            while(p.next != null){
                p = p.next;
            }
            p.next = head;
            newTail.next = null;
            return newHead;

        }
    }
}
