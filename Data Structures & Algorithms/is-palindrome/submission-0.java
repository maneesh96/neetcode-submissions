class Solution {
    public boolean isPalindrome(String s) {
        s =s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        char[] c = s.toCharArray();
        for(int i=0; i<c.length/2;i++){
            if(c[i]!=c[c.length-1-i]){
                return false;
            }
        }
        return true;
        
    }
}
