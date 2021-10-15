import util.TreeNode;

/**
 * @author sANbA111
 * @datetime 2021/6/23 18:33
 */
public class Num0104maxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        else return getDept(root,0);

    }
    public int getDept(TreeNode parent,int dept){
        dept++;
        int temp1=0,temp2=0;
        if(parent.left!=null)
            temp1 = getDept(parent.left,dept);
        if(parent.right!=null)
            temp2 = getDept(parent.right,dept);
        if(temp1+temp2==0)
            return dept;
        return temp1>temp2?temp1:temp2;
    }
}
