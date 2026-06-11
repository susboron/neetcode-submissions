class Solution {
    public int[] topKFrequent(int[] nums, int k) {    
    HashMap<Integer,Integer> freq =  new HashMap<>();

    for(int num : nums){
        if (freq.containsKey(num)){
            freq.put(num,freq.get(num) + 1);
        } else{
            freq.put(num,1);
        }
    }

    int[] result = new int[k];

    for(int i = 0; i < k;i++){
        int maxFreq = 0;
        int maxNum = 0;

        for(int num : freq.keySet()){
            if(freq.get(num)> maxFreq){
                maxFreq = freq.get(num);
                maxNum =  num;
            }
        }

        result[i] = maxNum;

        freq.remove(maxNum);
    }

    return result;
    }
}
