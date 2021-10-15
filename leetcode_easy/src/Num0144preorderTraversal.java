import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sANbA111
 * @datetime 2021/7/6 18:31
 */
public class Num0144preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        listAdd(root,list);
        return list;
    }

    public void listAdd(TreeNode root,List list){
        list.add(root.val);
        if(root.left != null){
            listAdd(root.left,list);
        }
        if(root.right != null){
            listAdd(root.right,list);
        }
    }


    @Test
    public void test(){
        TreeNode t = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> integers = preorderTraversal(t);
        for (Integer integer : integers) {
            System.out.println("integer = " + integer);
        }
    }
}
