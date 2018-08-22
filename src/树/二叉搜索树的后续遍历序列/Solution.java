package 树.二叉搜索树的后续遍历序列;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        return help(sequence,0,sequence.length-1);
    }

    private boolean help(int[] sequence, int start,int end) {

        if(sequence.length  == 0 || sequence == null){
            return false;
        }

        int root = sequence[end];

        int index = 0;
        for(;index<end;index++){
            if(sequence[index]>root){
                break;
            }
        }

        int j = index;
        for(;j<end;j++){
            if(sequence[j]<root){
                return false;
            }
        }

        boolean left = true;
        if(index >0){
            left = help(sequence, start,index-1 );
        }

        boolean right  = true;
        if(index < end){
            right = help(sequence,index,end-1);
        }
        return left && right;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.VerifySquenceOfBST(new int[]{4,6,7,5});
    }
}
