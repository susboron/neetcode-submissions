//O(n) time 

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        LinkedList<Integer> valueList = new LinkedList<>();

        int limit = nums.length/3;

        for(int key : map.keySet()){
            if (map.get(key)> limit){ //map.getKey() returns the value , not the key
                valueList.add(key);
            }
        }

        return valueList;
    }
}