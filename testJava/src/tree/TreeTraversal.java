package tree;

import java.util.Stack;

/**
 * Created by chenqingqing on 2017/4/9.
 */
public class TreeTraversal {
    public TreeNode root;
    public TreeTraversal(TreeNode root){
        this.root = root;
    }
    public void preFind(){
        preFind(root);

    }
    private void preFind(TreeNode node){
        if(node==null) return;
        visit(node);
        preFind(node.left);
        preFind(node.right);

    }
    public void inFind(){
        inFind(root);

    }
    private void inFind(TreeNode node){
        if(node==null) return;
        inFind(node.left);
        visit(node);
        inFind(node.right);

    }
    public void afterFind(){
        afterFind(root);

    }
    private void afterFind(TreeNode node){
        if(node==null) return;
        afterFind(node.left);
        afterFind(node.right);
        visit(node);

    }
    public void insert(int data){
        root = insert(root,data);
    }
    private TreeNode insert(TreeNode node,int data){
        if (node == null) return new TreeNode(data);
        if(node.val < data){
            node.right = insert(node.right,data);
        }else if(node.val > data){
            node.left = insert(node.left,data);
        }else{
            node.val = data;
        }
        return node;

    }
    private void visit(TreeNode node){
        System.out.print(node.val);
    }

    public void preOrder(TreeNode node)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(node != null || !stack.empty())
        {
            while(node != null)
            {
                //因为是前序遍历，直接打印
                System.out.print(node.val);
                //打印完要压入栈
                stack.push(node);
                //准备打印左节点，取左节点
                node = node.left;
            }
            if(!stack.empty())
            {
                //栈不为空就pop出来，由于右节点的获取需要读栈
                node = stack.pop();
                node = node.right;
            }
        }
    }
    public void inOrder(TreeNode node)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(node != null || !stack.empty())
        {
            while (node != null)
            {
                //将根节点先入栈，取左节点
                stack.push(node);
                node = node.left;
            }
            if(!stack.empty())
            {
                node = stack.pop();
                System.out.print(node.val);
                node = node.right;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {3,5,6,2,4,7};
        TreeTraversal test = new TreeTraversal(null);
        for(int i:arr){
            test.insert(i);
        }
        test.preOrder(test.root);

    }
}
