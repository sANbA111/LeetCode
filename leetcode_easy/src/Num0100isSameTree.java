import org.junit.Test;
import util.TreeNode;

import java.util.List;

/**
 * @author sANbA111
 * @datetime 2021/6/18 20:38
 */
public class Num0100isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p, q, true);
    }

    public boolean check(TreeNode p, TreeNode q, boolean flag) {
        if (p == null && q == null) return true;
        else if(p!=null && q!=null) flag = (p.val == q.val);
        else return false;
        if (!flag) return false;
        if (p.left != null && q.left != null) flag = check(p.left, q.left, flag);
        else if (p.left == null && q.left == null) flag = true;
        else return false;
        if (!flag) return false;
        if (p.right != null && q.right != null) flag = check(p.right, q.right, flag);
        else if (p.right == null && q.right == null) flag = true;
        else return false;
        return flag;
    }

    @Test
    public void test() {
        TreeNode p = new TreeNode(1, new TreeNode(5, null, null),null);
        TreeNode q = new TreeNode(1, new TreeNode(8,null, null),null);
        System.out.println("isSameTree(p,q) = " + isSameTree(p, q));
    }
}
