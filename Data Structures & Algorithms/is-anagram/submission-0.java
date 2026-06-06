
class Solution {

    public String sort(String input){
        char temp[] = input.toCharArray();
        Arrays.sort(temp);
        return new String (temp);
    }

    public boolean isAnagram(String s, String t) {

        String sorted_s = sort(s);
        String sorted_t = sort(t);

        if(sorted_s.equals(sorted_t))
            return true;
/*
        char[] s_strings = s.toCharArray();
        s_strings = Arrays.sort(s);
        String[] t_strings = new String[s.length];
        t_strings = Arrays.sort(t);

        if(s_strings == t_strings)
            return true;
*/
    return false;
    }
}
