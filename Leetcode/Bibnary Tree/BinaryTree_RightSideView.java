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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
       if(root == null ){
           return result;
       } 
       Queue<TreeNode>que = new LinkedList<>();
       que.add(root);
       while(!que.isEmpty()){
        int size = que.size();
           
           while(size>0){
               TreeNode rnode = que.remove();
               if(size == 1){
                   result.add(rnode.val);
               }
               if(rnode.left != null){
                   que.add(rnode.left);
               }
               if(rnode.right != null){
                   que.add(rnode.right);
               }
               size--;
           }
       }
       return result;

    }
}
