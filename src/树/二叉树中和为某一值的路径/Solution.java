package 树.二叉树中和为某一值的路径;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
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
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> allPath = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        if(root == null){
            return allPath;
        }
        path.add(root.val);
        target = target-root.val;
        if(target == 0 && root.left == null && root.right == null){
            allPath.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        // 深度遍历完一条路径后要回退
        path.remove(path.size()-1);
        return allPath;
    }
}
