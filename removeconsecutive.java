class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        char[] s1=s.toCharArray();
        sb.append(s1[0]);
        for(int i=1; i<s1.length; i++){
            if(s1[i-1]==s1[i]){
                continue;
            }
            sb.append(s1[i]);
        }
        return sb.toString();
    }
}
