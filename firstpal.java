class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            boolean flag=true;
            int l=0;
            int r=s.length()-1;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    flag=false;
                    break;
                }
                else{
                    l++;
                    r--;
                }
            }
            if(flag){
                return s;
            }
        }
        return "";
    }
}