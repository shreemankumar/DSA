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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        int level = 1;

        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> copy = new ArrayList<>();  // Initialize the list for each level

            while (size-- > 0) {
                TreeNode rnode = que.remove();
                copy.add(rnode.val);

                if (rnode.left != null) {
                    que.add(rnode.left);
                }

                if (rnode.right != null) {
                    que.add(rnode.right);
                }
            }

            if (level % 2 == 0) {
                Collections.reverse(copy);  // Reverse the list for even levels
            }

            result.add(copy);  // Add the copy list to the result
            level++;
        }

        return result;
    }
}
