class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> grouped = new HashMap<>();

        for(String string : strs){
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!grouped.containsKey(key)){
                grouped.put(key,new ArrayList<>());
            }

            grouped.get(key).add(string);
        }

        return new ArrayList<>(grouped.values());

    }
}