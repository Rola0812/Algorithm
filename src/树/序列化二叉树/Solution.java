package 树.序列化二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
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
    String Serialize(TreeNode root) {
        if(root == null){
            return "#!";
        }
        String res = root.val+ "!";
        res+=Serialize(root.left);
        res+=Serialize(root.right);
        return res;
    }

    TreeNode Deserialize(String str) {
        String[] values = str.split("!");
        Queue<String> queue = new LinkedList<String>();
        for(int i = 0;i != values.length;i++){
            queue.offer(values[i]);
        }
        return reconPreOrder(queue);

    }

    TreeNode reconPreOrder(Queue<String> queue){
        String value = queue.poll();
        if(value.equals("#")){
            return null;
        }
        TreeNode head = new TreeNode(Integer.valueOf(value));
        head.left = reconPreOrder(queue);
        head.right = reconPreOrder(queue);
        return head;
    }
}
