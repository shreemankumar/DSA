public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        // we will get each asteroid from one by one from asteroids[]
        for(int asteroid:asteroids){
            if(asteroid>0){
                st.push(asteroid);
            }
            else{
                while(st.size()>0 && st.peek()>0 && st.peek()<-asteroid){
                    st.pop();
                }
                if(st.size()>0 && st.peek()>-asteroid){
                    //it destroyed me , hence there is no space for me in free universe
                    continue;
                }
                else if(st.size()>0 && st.peek()== -asteroid){
                    // we both got destroyed.
                    st.pop();
                   
                }
                else{
                    st.push(asteroid);
                }
            }
        }
        // reverse stack 
        int ans[] =new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
} 
