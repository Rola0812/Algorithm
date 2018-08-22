package 树.二叉树的深度;

/**
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class Solution {
    public int TreeDepth2(TreeNode root) {
        if(root == null){
            return 0;
        }
        return getDepth2(root, 0);
    }

    private int getDepth2(TreeNode root, int depth) {
        if(root == null){
            return depth;
        }
        return Math.max(getDepth2(root.left, depth+1),getDepth2(root.right, depth+1));
    }

    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1+Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }

}
