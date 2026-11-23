class ProductOfNumbers {
    private List<Integer> prefSum;
    public ProductOfNumbers() {
        this.prefSum = new ArrayList<>();
        this.prefSum.add(1); 
    }
    
    public void add(int num) {
        if (prefSum.getLast() != 0) prefSum.add(num * prefSum.getLast());
        else {
            prefSum.clear();
            prefSum.add(1);
            prefSum.add(num);
        }
    }
    
    public int getProduct(int k) {
        if (prefSum.size() - 1 < k) return 0;
        int d = prefSum.get(prefSum.size() - 1 - k);
        return prefSum.getLast() / d;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */