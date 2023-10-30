
            // leetcode 84(hard)

class Solution {
    public int[] getNSERI(int[] arr, int n) {
        int[] nseri = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int ele = arr[i];

            while (!st.isEmpty() && arr[st.peek()] > ele) {
                nseri[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            nseri[st.peek()] = n;
            st.pop();
        }
        return nseri;
    }

    public int[] getNSELI(int[] arr, int n) {
        int[] nseli = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int ele = arr[i];

            while (!st.isEmpty() && arr[st.peek()] > ele) {
                nseli[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            nseli[st.peek()] = -1;
            st.pop();
        }
        return nseli;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] nseli = getNSELI(heights, n);
        int[] nseri = getNSERI(heights, n);

        int maxarea = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nseri[i] - nseli[i] - 1;
            int area = height * width;
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }
}



//method 2

class Solution {
     public int[] getNSELI(int[] arr, int n) {
        int[] nseli = new int[n];
        int[] nseri = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int ele = arr[i];

            while (!st.isEmpty() && arr[st.peek()] > ele) {
                int idx=t.peek();
                nseli[idx] = i;
                st.pop();
            }
            st.push(i);
        }
           if(!st.isEmpty()){
                nseli[idx] = i;
            }
            else{
                 nseli[idx] = n;
            }

        while (!st.isEmpty()) {
            nseli[st.peek()] = -1;
            st.pop();
        }
        if(!st.isEmpty()){
                nseli[idx] = i;
            }
            else{
                 nseli[idx] = n;
            }
              int maxarea = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nseri[i] - nseli[i] - 1;
            int area = height * width;
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
        
    }
}

