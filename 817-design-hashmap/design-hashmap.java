class MyHashMap {

    int k[], v[];

    public MyHashMap() {
        k =new int[1_000_001];
        v = new int[1_000_001];

        Arrays.fill(v,-1);
    }
    
    public void put(int key, int value) {
        k[key]=key;
        v[key]=value;
    }
    
    public int get(int key) {
        return v[key];
    }
    
    public void remove(int key) {
        k[key]=0;
        v[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */