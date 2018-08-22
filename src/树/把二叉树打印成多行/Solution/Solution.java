package 树.把二叉树打印成多行.Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
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
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return list;
        }
        TreeNode node = pRoot;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(pRoot);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> currentlist = new ArrayList<Integer>();
            for(int i=0;i<size;i++) {
                node = queue.poll();
                currentlist.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(currentlist);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
        return list;
    }
}
