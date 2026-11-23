class ProductOfNumbers {
    List<Long> list ;

    public ProductOfNumbers() {
        list = new ArrayList<>();
        list.add(1L);
    }
    public void add(int num) {
         if( num == 0){
            list.clear();
            list.add(1L);
         }
         else {
            list.add(list.get(list.size()-1)*num);
         }
    }
    
    public int getProduct(int k) {
        if (k >= list.size()) {
            return 0;
        }
        int n = list.size();
        return (int)(list.get(n-1) / list.get(n-k-1));
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */