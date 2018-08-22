package 树.二叉树的镜像;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
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
    public void Mirror(TreeNode root) {

        if(root == null){
            return;
        }
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;
        Mirror(root.left);
        Mirror(root.right);
    }
}
