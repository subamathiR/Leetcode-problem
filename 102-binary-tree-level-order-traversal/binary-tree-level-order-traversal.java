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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> r = new ArrayList<>();
        
        if (root == null)
            return r;

        q.add(root);

        while (q.size() > 0) {
            int size = q.size();
            ArrayList<Integer> curr = new ArrayList<>();

            while (size-- > 0) {
                TreeNode currentElement = q.poll();
                curr.add(currentElement.val);

                if (currentElement.left != null)
                    q.add(currentElement.left);
                if (currentElement.right != null)
                    q.add(currentElement.right);
            }

            r.add(curr);  
        }

        return r;
    }
}
