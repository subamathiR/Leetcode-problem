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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderrec(root,result);
        return result;
    }
    void postorderrec(TreeNode root,List<Integer> result)
    {
        if(root!=null)
        {
            postorderrec(root.left,result);
            postorderrec(root.right,result);
            result.add(root.val);
        }
    }
}
