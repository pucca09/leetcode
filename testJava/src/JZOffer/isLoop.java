package JZOffer;

import linkedList.ListNode;

/**
 * Created by chenqingqing on 2017/4/13.
 */

/**
 * 判断是否有环
 */
public class isLoop {
    public boolean testLoop(ListNode root){
        ListNode fast = root;
        ListNode slow = root;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }

        }
        return !(fast == null || fast.next == null);
    }
}
