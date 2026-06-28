class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }

        int [] need = new int[26]; //count char in s1
        int [] window = new int[26]; //count char in s2

        for(int i = 0; i < s1.length();i++){
            need[s1.charAt(i) - 'a']++; //increase count according to which char is found
            window[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(need,window)){
            return true;
        }

        for(int right = s1.length(); right < s2.length();right ++){
            window[s2.charAt(right) - 'a']++;
            window[s2.charAt(right - s1.length()) - 'a']--;

            if(Arrays.equals(need,window)){
                return true;
            }
        }
        return false;
    }
}
