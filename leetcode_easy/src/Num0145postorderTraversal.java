import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sANbA111
 * @datetime 2021/7/6 18:51
 */
public class Num0145postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        listAdd(root,list);
        return list;
    }

    public void listAdd(TreeNode root,List list){
        if(root.left != null){
            listAdd(root.left,list);
        }
        if(root.right != null){
            listAdd(root.right,list);
        }
        list.add(root.val);
    }
}
