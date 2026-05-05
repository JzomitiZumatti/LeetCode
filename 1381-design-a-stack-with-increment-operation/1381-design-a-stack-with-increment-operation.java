class CustomStack {
    int top;
    private int[] arr;

    public CustomStack(int maxSize) {
        this.arr = new int[maxSize];
        this.top = -1; 
    }
    
    public void push(int x) {
        if (top < arr.length - 1) {
            top++;
            arr[top] = x;
        }
    }
    
    public int pop() {
        int ans = -1;
        if (top >= 0) {
            ans = arr[top];
            top--;
        }
        return ans;
    }
    
    public void increment(int k, int val) {
        if (top < k) {
            for (int i = 0; i <= top; i++) {
                arr[i] += val;
            }
        } else {
            for (int i = 0; i < k; i++) {
                arr[i] += val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */