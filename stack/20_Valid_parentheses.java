public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i<s.length(); i++) {
           char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            
            else if(ch == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            }
            else if(ch == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            }
            else if(ch == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        // return true if no open parentheses left in stack
        return stack.empty();
    }
}