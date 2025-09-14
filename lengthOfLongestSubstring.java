class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        int max=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        for(int r=0; r<s.length(); r++){
            char curr=s.charAt(r);
            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            max=Math.max(max,r-left+1);
        }
        return max;
    }
}
