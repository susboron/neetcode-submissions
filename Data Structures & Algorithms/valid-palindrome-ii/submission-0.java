class Solution {
    public boolean isPalindrome(String s) {
        String text = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        char[] arr= text.toCharArray();

        int left = 0;
        int right = arr.length - 1;


        while ( left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left += 1;
            right -= 1;
        }

        String reverse = new String(arr);

        return reverse.equals(text);
        
    }
    public boolean validPalindrome(String s) {
        
        if (isPalindrome(s)) {
            return true;
        }

        int n = s.length();

        for(int i = 0;i < n ;i++){
            String modified = s.substring(0,i) + s.substring(i+1);

            if(isPalindrome(modified)){
                return true;
            }
        }
        return false;
    }
}