class RandomizedSet {
private HashMap<Integer,Integer> mpp; 
private ArrayList<Integer> data; 
private Random random;
    public RandomizedSet() {
        mpp = new HashMap<>();
        data = new ArrayList<>();
        random = new Random();
    }
    public boolean insert(int val) {
        boolean isExist = mpp.containsKey(val);
        if(!isExist){
            data.add(val);
            mpp.put(val,data.size()-1);
        }
        return !isExist;
    }
    
    public boolean remove(int val) {
        boolean isExist = mpp.containsKey(val);
        if(isExist){
            int index = mpp.get(val);
            int lastVal = data.get(data.size()-1);
            data.set(index,lastVal);
            data.set(data.size()-1,val);
            mpp.put(lastVal,index);

            data.remove(data.size()-1);
            mpp.remove(val);
        }
        return isExist;
    }
    
    public int getRandom() {
        int ran = random.nextInt(data.size());
        return data.get(ran);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */