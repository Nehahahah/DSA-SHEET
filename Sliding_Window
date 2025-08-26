class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
        int n=arr.length;
        if(n<k){
            return -1;
        }
        int window=0;
        for(int i=0;i<k;i++){
            window+=arr[i];
        }
        int max=window;
        for(int i=k; i<arr.length; i++){
            window+=arr[i]-arr[i-k];
            max=Math.max(window,max);
        }
        return max;
    }
}
