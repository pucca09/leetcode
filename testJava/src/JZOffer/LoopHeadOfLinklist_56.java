package JZOffer;

import linkedList.ListNode;

/**
 * Created by chenqingqing on 2017/4/14.
 */
public class LoopHeadOfLinklist_56 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        int count = 1;
        if(testRing(pHead)!=null){
            ListNode p = testRing(pHead);
            ListNode q = p.next;
            while( q != p){
                count++;
                q = q.next;
            }
            p = pHead;
            q = pHead;
            while(count >0){
                p = p.next;
                count--;
            }
            while(p !=q ){
                p = p.next;
                q = q.next;
            }
            return q;


        }else{
            return null;
        }

    }
    private ListNode testRing(ListNode pHead){
        ListNode p = pHead;
        ListNode q = pHead;
        while (p != null && p.next != null)
        {
            p = p.next.next;
            q = q.next;
            if(p == q)
                return p;
        }
        return null;
    }
}
