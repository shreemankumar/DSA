import javafx.geometry.Pos;

import java.io.*;
import java.util.*;
import java.lang.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Solution {
    void getwidth(TreeNode root , int pos){
        int maximumpos = 0;
        int minimumpos = 0;
        if(root == null){
            return ;
        }
        getwidth(root.left, pos-1);
        getwidth(root.right, pos+1);

        maximumpos=Math.max(pos, maximumpos);
        minimumpos=Math.min(pos, minimumpos);
        
        return;
    }
    List<List<Integer>> VerticalTraversal(TreeNode root) {
        //Write your code here
        
        getwidth(root,0);
        int width=maximumpos-minimumpos;
        int level = width+1;

        List<List<Integer>> vw = new ArrayList<>();
        for(int i=0;i<level;i++){
            vw.add(new ArrayList<>());
        } 
        Queue<Integer> que = new ArrayDeque<>();
        que.add(new pair(root,minimumpos));


    
      

    }
}

class Main {

    static TreeNode buildTree(String str) {
        if(str.length()==0 || str.charAt(0)=='N')
            return null;

        String ip[] = str.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(ip[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            TreeNode currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            TreeNode root = buildTree(s);
            Solution ob = new Solution();
            List<List<Integer>> ans = ob.VerticalTraversal(root);
            for(int i = 0; i < ans.size(); i++) {
                for(int a : ans.get(i)) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }
            System.out.println();
            t--;
        }
    }
}