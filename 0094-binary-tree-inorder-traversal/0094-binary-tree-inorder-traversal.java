/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
           return new ArrayList<Integer>(); 
        }
        List<Integer> ans = new ArrayList<Integer>();
        List<Integer> leftSubTree = inorderTraversal(root.left);
        ans.addAll(leftSubTree);
        ans.add(root.val);
        List<Integer> rightSubTree = inorderTraversal(root.right);
        ans.addAll(rightSubTree);
        return ans;
    }
}