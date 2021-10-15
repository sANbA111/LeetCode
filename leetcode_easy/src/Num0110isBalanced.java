import util.TreeNode;

/**
 * @author sANbA111
 * @datetime 2021/6/24 9:48
 */
public class Num0110isBalanced {
    /*public boolean isBalanced(TreeNode root)  {
        if(root==null) return true;
        int balance = 0;
        int rootBalance = 0;
        boolean flag = true;
        return check(flag,root,rootBalance,balance);
    }
    public boolean check(boolean flag,TreeNode t,int rootBalance,int balance){
        if(flag&&t!=null){
               if (t.left!=null) balance--;
               if (t.right!=null) balance++;
               if(Math.abs(balance)>=2||Math.abs(rootBalance)>=2) flag = false;
               return check(flag,t.left,t.left==null?balance:balance--,0) && check(flag,t.right,t.right==null?balance:balance++,0);
        }else{
            return flag;
        }
    }*/
    public boolean isBalanced(TreeNode root){
        return height(root)>=0;
    }

    private int height(TreeNode root) {
        if(root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight-rightHeight)>=2 || leftHeight == -1 || rightHeight == -1){
            return -1;
        }else{
            return Math.max(rightHeight,leftHeight)+1;
        }
    }
}
