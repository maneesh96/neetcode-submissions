class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if(strs.length==0) return "";
        Arrays.sort(strs);
        char [] c = strs[0].toCharArray();
        char [] c1 = strs[strs.length-1].toCharArray();
        for(int i=0; i<c.length;i++){

            if(c[i]!=c1[i]) break;
                result.append(c[i]);
        }
        return result.toString();

    }
}