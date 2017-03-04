package tree;

/**
 * Created by chenqingqing on 2017/3/4.
 */
public class DeleteNodeInBST_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val == key){
            if(root.right == null){
                root =  root.left;
            }else if(root.left == null){
                root =  root.right;
            }else{
                TreeNode t = min(root.right);
                t.left = root.left;
                t.right = deleteMin(root.right);
                root = t;
            }
        }else if(root.val < key){
            root.right = deleteNode(root.right,key);

        }else{
            root.left = deleteNode(root.left,key);
        }
        return root;

    }

    private TreeNode deleteMin(TreeNode root){
        if(root ==null){
            return null;
        }
        if(root.left == null){
            return root.right;
        }else{
            root.left = deleteMin(root.left);
        }
        return root;
    }
    private TreeNode min(TreeNode root){
        if(root == null){
            return null;
        }
        if(root.left == null){
            return root;
        }else{
            return min(root.left);
        }
    }

}
