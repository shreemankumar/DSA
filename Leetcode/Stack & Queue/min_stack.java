public class min_stack {
    
}
class MinStack {
    class Pair {
        int val;
        int min;

        Pair(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    Stack<Pair> st = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new Pair(val, val));
        } else {
            int myMin = Math.min(val, st.peek().min);
            st.push(new Pair(val, myMin));
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek().val;
        }
        return -1; 
    }

    public int getMin() {
        if (!st.isEmpty()) {
            return st.peek().min;
        }
        return -1;
    }
}

