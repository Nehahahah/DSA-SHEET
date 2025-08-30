class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int smallDiff=Integer.MAX_VALUE;
        int Diff=0;
        for(int i=0; i<=arr.size()-m; i++){
            Diff=arr.get(i+m-1)-arr.get(i);
            smallDiff=Math.min(Diff,smallDiff);
        }
        return smallDiff;
    }
}
