class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer,Integer> frquencyMap = new HashMap<Integer,Integer>();
        for(int num :nums){
        frquencyMap.put(num,frquencyMap.getOrDefault(num,0)+1);
        }
        for(int key:frquencyMap.keySet()){
            int frequency = frquencyMap.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res = new int[k];
        int counter=0;
        for(int pos=bucket.length-1;pos>=0&&counter<k;pos--){
            if(bucket[pos]!=null){
                for(Integer inter:bucket[pos]){
                    res[counter++]=inter;
                }
            }
        }
        return res;
    }
}
