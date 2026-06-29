class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] text = s.toCharArray();
        int count = 0;
        
        for(Character br : text){
            if(br == '(' || br == '{' ||  br == '['){
                st.push(br);
                count++;
            }   
            else {
                if(st.isEmpty()) return false;

                char top = st.pop();

                if(br ==')' && top != '(') return false;
                if(br =='}' && top != '{') return false;
                if(br ==']' && top != '[') return false;
            }
        }

        return st.isEmpty();
    }
}
