package 树.二叉搜索树的第k个节点;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如，
 * （5，3，7，2，4，6，8）中，按结点数值大小顺序第三小结点的值为4。
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
    ArrayList<TreeNode> list = new ArrayList<TreeNode>();
    TreeNode KthNode2(TreeNode pRoot, int k)
    {
        if(k==0){
            return null;
        }
        initlist(pRoot, list);
        if(k>list.size()){
            return null;
        }
        return list.get(k-1);

    }

    private void initlist(TreeNode pRoot, List list) {
        if(pRoot == null){
            return;
        }
        initlist(pRoot.left, list);
        list.add(pRoot);
        initlist(pRoot.right, list);
    }

}
