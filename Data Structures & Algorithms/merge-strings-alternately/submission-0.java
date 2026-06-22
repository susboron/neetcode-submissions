class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] text1 = word1.toCharArray();
        char[] text2 = word2.toCharArray();

        int l1 = word1.length();
        int l2 = word2.length();
        int length = l1 + l2;

        int leftone = 0;
        int lefttwo = 0;

        char[] arr = new char[length];

        int i = 0 , j = 0 , k = 0;

        while ( i < l1 || j < l2){
            if ( i < l1){
                arr[k] = text1[i];
                k++;
                i++;
            }
            if (j < l2){
                arr[k] = text2[j];
                k++;
                j++;
            }
        }

        String merged = new String(arr);

        return merged;

    }
}