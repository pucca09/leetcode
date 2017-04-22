package JZOffer;

import linkedList.ListNode;

/**
 * Created by chenqingqing on 2017/4/13.
 */
public class MergeLinkedList_17 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode p = list1;
        ListNode q = list2;
        ListNode root = new ListNode(1);
        ListNode pointer =root;
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }else{
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;

        }
        if(list1 != null){
            pointer.next = list1;
        }
        if(list2 != null){
            pointer.next = list2;
        }

        return root.next;

    }
}
