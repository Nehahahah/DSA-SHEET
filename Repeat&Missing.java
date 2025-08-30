class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> arl=new ArrayList<>();
        Arrays.sort(arr);
        int rep=0;
        long sum=arr[0];
        for(int i=1; i<arr.length; i++){
            sum+=arr[i];
            if(arr[i]==arr[i-1]){
                rep=arr[i];
            }
        }
        long expectedsum=(long) n*(n+1)/2;
        int miss=(int)(expectedsum-(sum-rep));
        arl.add(rep);
        arl.add(miss);
        return arl;     
    }
}
