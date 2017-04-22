package JZOffer;

/**
 * Created by chenqingqing on 2017/4/14.
 */
public class LinkListCopy_26 {
    public class RandomListNode{
        RandomListNode random;
        RandomListNode next;
        int val;
        public RandomListNode(int num){this.val = num;}
    }
    public RandomListNode Clone(RandomListNode pHead)
    {

        //第一步，复制
        if(pHead == null){
            return null;
        }
        RandomListNode point1 = pHead;
        while(point1!= null){
            RandomListNode v = new RandomListNode(point1.val);
            v.next = point1.next;
            point1.next = v;
            point1 = v.next;
        }
        //第二步，随机链接
        RandomListNode point2 = pHead;
        while(point2 != null){
            //非常重要，不然会出现空指针错误
            if(point2.random != null){
                point2.next.random = point2.random.next;
            }

            point2 = point2.next.next;


        }
        //第三步
        RandomListNode copyHead = pHead.next;
        RandomListNode point3 = copyHead;
        pHead.next = point3.next;
        pHead = pHead.next;
        while(pHead != null){
            point3.next = pHead.next;
            point3 = point3.next;
            pHead.next = point3.next;
            pHead = pHead.next;
        }
        return copyHead;

    }
}
