class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> grouped = new HashMap<>();

        for(String string : strs){
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            grouped.computeIfAbsent(key, k -> new ArrayList<>()).add(string);
        }

        return new ArrayList<>(grouped.values());

    }
}
