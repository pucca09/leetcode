package JZOffer;

import linkedList.ListNode;

/**
 * Created by chenqingqing on 2017/4/13.
 */
public class commonNodeOfLinkedList {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);
        if(len1 > len2){
            for(int i=0;i<len1-len2;i++){
                pHead1 = pHead1.next;
            }

        }else if(len1<len2){
            for(int i=0;i<len2-len1;i++){
                pHead2 = pHead2.next;
            }
        }
        while(pHead1 != null && pHead2 != null && pHead1 != pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead2;


    }
    private int getLength(ListNode node){
        int count = 0;
        while(node != null){
            count ++;
            node = node.next;
        }
        return count;
    }
}
