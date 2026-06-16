class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> result =new HashMap<String, List>();
        for (String word : strs){
            char [] c =word.toCharArray();
            Arrays.sort(c);
            String key =String.valueOf(c);
            if(!result.containsKey(key)) result.put(key,new ArrayList());
            result.get(key).add(word); 
        }
        return new ArrayList(result.values());       
    }  
}
