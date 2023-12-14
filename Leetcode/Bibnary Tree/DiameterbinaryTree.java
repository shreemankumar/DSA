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
    class pair{
   int height;
   int dia;
   pair(){
       height = 0;
       dia = 0;
   }
   pair(int height , int diameter){
       this.height = height ;
       this.dia = diameter;
   }
} 
public pair diameter(TreeNode root){
   if(root == null){
       return new pair();
   }
  pair leftpair = diameter(root.left);
  pair rightpair  = diameter(root.right);
  int height = Math.max(leftpair.height,rightpair.height)+1;
  int diaPissingThroughtme= leftpair.height+rightpair.height;
  int dia = Math.max(diaPissingThroughtme,Math.max( leftpair.dia, rightpair.dia));

  return new pair(height,dia);
}
  public int diameterOfBinaryTree(TreeNode root) {
     pair pair =diameter(root);
     return pair.dia;

  }
}