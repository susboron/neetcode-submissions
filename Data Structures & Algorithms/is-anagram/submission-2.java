
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

    return false;
    }
}
