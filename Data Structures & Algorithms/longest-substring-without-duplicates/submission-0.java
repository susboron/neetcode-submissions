class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> map = new HashSet<>();
        char[] text = s.toCharArray();
        int left = 0;
        int maxCount = 0;
        for(int right = 0; right < text.length;right ++){

            while(map.contains(text[right])){
                map.remove(text[left]);
                left++;
            }

            map.add(text[right]);
            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}
