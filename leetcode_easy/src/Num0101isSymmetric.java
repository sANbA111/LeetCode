import util.TreeNode;

/**
 * @author sANbA111
 * @datetime 2021/6/19 8:49
 */
public class Num0101isSymmetric {
    /*public boolean isSymmetric(TreeNode root) {
        TreeNode root1 = new TreeNode(root.val,root.right,root.left);
        return check(root,root1,true);
    }
    public boolean check (TreeNode t1, TreeNode t2, boolean flag){

    }*/

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }


}
