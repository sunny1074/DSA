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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftChild = minDepth(root.left);
        int rightChild = minDepth(root.right);
        int ans = 0;
        if(leftChild == 0){
            ans = rightChild + 1;
        }else if(rightChild == 0){
            ans = leftChild + 1;
        }else{
            ans = Math.min(leftChild, rightChild) + 1;
        }
        return ans;
    }
}