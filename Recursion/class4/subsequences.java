import java.util.ArrayList;

public class subsequences{
    public static ArrayList<String> getSubsequence(String str){
        if(str.length()==0){
            ArrayList<String> b=new ArrayList<>();
            b.add(" ");
            return b;
        }
       char frist_char = str.charAt(0);
       String ss =str.substring(1);

       ArrayList<String>sAns=getSubsequence(ss);
       ArrayList<String>ans = new ArrayList<>();
       
       for(int i=0;i<sAns.size();i++){
        String sub =sAns.get(i);
        ans.add(sub);

       }
       for(int i=0;i<sAns.size();i++){
        String sub =sAns.get(i);
        String ansSub =frist_char+sub;
        ans.add(ansSub);
       }
       return ans;


    }
    public static void main(String[] args) {
       ArrayList<String> sub= getSubsequence("abcd");
       System.out.println(sub); 
    }
 }