class MyHashSet {

    boolean val[];

    public MyHashSet() {
        val = new boolean[1_000_001];
    }
    
    public void add(int key) {
        val[key]=true;
    }
    
    public void remove(int key) {
        val[key]=false;
    }
    
    public boolean contains(int key) {
        return val[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */