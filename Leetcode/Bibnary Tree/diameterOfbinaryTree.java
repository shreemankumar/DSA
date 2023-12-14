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
    public int maxdepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int maxdiaInleft = maxdepth(root.left);
        int maxdiaInright = maxdepth(root.right);
        int mydepth = Math.max(maxdiaInleft,maxdiaInright)+1;
        return mydepth;
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        int maxdiaInleft = diameterOfBinaryTree(root.left);
        int maxdiaInright = diameterOfBinaryTree(root.right);
        int mydia = maxdepth(root.left)+maxdepth(root.right);

        return Math.max(mydia , Math.max(maxdiaInleft,maxdiaInright));
    }
}