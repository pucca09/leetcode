package Btree;

/**
 * Created by chenqingqing on 2017/2/23.
 */
public class reConstructBinaryTree_06 {
    //由前，中重构树
    public BTNode reconstruct(int[] pre,int[] in){
        BTNode root = reconstruct(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //由前中直接输出后
    public void getAfter(int[] pre,int[] in){
        getAfter(pre,0,pre.length-1,in,0,in.length-1);
        return;
    }
    //由后，中重构树
    public BTNode reconstruct2(int[] pre,int[] in){
        BTNode root = reconstruct2(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //由后中直接输出前
    public void getPre(int[] pre,int[] in){
        getPre(pre,0,pre.length-1,in,0,in.length-1);
        return;
    }
    private BTNode reconstruct(int[] pre,int preSart,int preEnd,int[] in,int inSart,int inEnd){
        if(preSart > preEnd || inSart > inEnd){
            return null;
        }
        BTNode root = new BTNode(pre[preSart]);
        //寻找在中序遍历中的位置
        for(int i = inSart;i <= inEnd;i++){
            if(in[i] == pre[preSart]){
                int lenLeft = i-inSart;
                int lenRight = inEnd-i;
                root.left = reconstruct(pre,preSart+1,preSart+lenLeft,in,inSart,i-1);
                root.right = reconstruct(pre,preSart+lenLeft+1,preEnd,in,i+1,inEnd);

            }

        }
        return root;

    }
    private void getAfter(int[] pre,int preSart,int preEnd,int[] in,int inSart,int inEnd){
        if(preSart > preEnd || inSart > inEnd){
            return;
        }
        BTNode root = new BTNode(pre[preSart]);
        //寻找在中序遍历中的位置
        int label = 0;
        for(int i = inSart;i <= inEnd;i++){
            if(in[i] == pre[preSart]){
                int lenLeft = i-inSart;
                int lenRight = inEnd-i;
                getAfter(pre,preSart+1,preSart+lenLeft,in,inSart,i-1);
                getAfter(pre,preSart+lenLeft+1,preEnd,in,i+1,inEnd);

            }

        }
        System.out.print(root.val);


    }

    private BTNode reconstruct2(int[] after,int afterSart,int afterEnd,int[] in,int inSart,int inEnd){
        if(afterSart > afterEnd || inSart > inEnd){
            return null;
        }
        BTNode root = new BTNode(after[afterEnd]);
        //寻找在中序遍历中的位置
        int label = 0;
        for(int i = inSart;i <= inEnd;i++){
            if(in[i] == after[afterEnd]){
                int lenLeft = i-inSart;
                int lenRight = inEnd-i;
                root.left = reconstruct2(after,afterSart,afterSart+lenLeft-1,in,inSart,i-1);
                root.right = reconstruct2(after,afterSart+lenLeft,afterEnd-1,in,i+1,inEnd);

            }

        }
        return root;

    }

    private void getPre(int[] after,int afterSart,int afterEnd,int[] in,int inSart,int inEnd){
        if(afterSart > afterEnd || inSart > inEnd){
            return;
        }
        BTNode root = new BTNode(after[afterEnd]);
        System.out.print(root.val);
        //寻找在中序遍历中的位置
        int label = 0;
        for(int i = inSart;i <= inEnd;i++){
            if(in[i] == after[afterEnd]){
                int lenLeft = i-inSart;
                int lenRight = inEnd-i;
                getPre(after,afterSart,afterSart+lenLeft-1,in,inSart,i-1);
                getPre(after,afterSart+lenLeft,afterEnd-1,in,i+1,inEnd);

            }

        }



    }
    public static void main(String[] args){
        int[] a = {7,4,2,5,8,6,3,1};
        //int[] a = {1,2,4,7,3,5,6,8};
        int[] b = {4,7,2,1,5,3,8,6};
        reConstructBinaryTree_06 test = new reConstructBinaryTree_06();
        test.getPre(a,b);
//        BTNode root = test.reconstruct(a,b);
//        BTreeTraversal test2 = new BTreeTraversal(root);
//        test2.preFind();
    }

}
