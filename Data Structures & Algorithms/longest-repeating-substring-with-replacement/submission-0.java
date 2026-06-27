class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right ++){
            char c = s.charAt(right);

            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            } else {
                map.put(c,1);
            }

            maxFreq = Math.max(maxFreq,map.get(c));

            while((right - left + 1) - maxFreq > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
