import javax.swing.tree.TreeNode;

/**
 *  
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * } 
 */

class Solution {
    private void inorderTraversal(TreeNode root, List<Integer> answer){
        if(root == null){
            return;
        }
        inorderTraversal(root.left, answer);
        answer.add(root.val);
        inorderTraversal(root.right,answer);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        inorderTraversal(root,answer);
        return answer;
    }
}