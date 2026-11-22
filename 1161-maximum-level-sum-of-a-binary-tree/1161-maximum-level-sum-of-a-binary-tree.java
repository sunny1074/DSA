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
    public int maxLevelSum(TreeNode root) {
        int ans = 0;
        int currentlvl = 1;
        int result = Integer.MIN_VALUE;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            int sum = 0;
            for(int i=0; i<size; i++){
                TreeNode current = qu.remove();

                sum += (current.val);

                if(current.left != null)
                qu.add(current.left);

                if(current.right != null)
                qu.add(current.right);
            }
            if(sum > result){
                ans = currentlvl;
                result = sum; 
            }
            currentlvl++;

        }
        return ans;
    }
}