import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sANbA111
 * @datetime 2021/6/18 18:58
 */
public class Num0094inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode root,List list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

    //改进
    public void inorder2(TreeNode root,List list){
        if(root==null) return;
        if(root.left!=null)
            inorder(root.left,list);
        list.add(root.val);
        if(root.right!=null)
            inorder(root.right,list);
    }
    @Test
    public void test(){
        TreeNode root = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        List<Integer> list = inorderTraversal(root);
        System.out.println("list = " + list);
    }
}
