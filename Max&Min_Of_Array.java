class Pair<K, V> { //pre-written class on gfg 
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) { //My solution
        // Code Here
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new Pair<>(min,max);  
    }
}
