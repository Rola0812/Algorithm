package 树.按之字形打印二叉树;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class Solution {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) {
            return arrayList;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode node = pRoot;
        queue.offer(node);
        boolean LtoR = false;
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                if (LtoR) {
                    list.add(0, node.val);
                } else {
                    list.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            LtoR = !LtoR;
            arrayList.add(list);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                System.out.print(arrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }
        return arrayList;
    }
}
