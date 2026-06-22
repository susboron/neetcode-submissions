class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0;i < n;i++){
            for(int j = m; j < nums1.length;j++){
                if (nums1[j] == 0){
                    nums1[j] = nums2[i++];
                }
            }
        }

        for(int i = 0;i < nums1.length;i++){
            for(int j = i ; j < nums1.length;j++ ){
                if (nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}