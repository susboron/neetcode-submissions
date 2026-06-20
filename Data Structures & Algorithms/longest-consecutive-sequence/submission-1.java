class Solution {
    public int longestConsecutive(int[] nums) {

        if ( nums.length == 0) return 0;

        for(int i = 0 ; i <nums.length;i++){
            for(int j = i ; j < nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]= temp;
                }
            }
        }

        int count = 0 ;
        int maxstreak = 0;
        for(int i = 0 ; i < nums.length-1;i++){
            if(nums [i+1] == nums[i]){
                continue;
            }
            if(nums[i+1] == nums[i] + 1){
                count++;
                if(maxstreak < count){
                    maxstreak = count;
                }
            } else if (nums[i+1] != nums[i]){
                count = 0;
            }
        }

        return maxstreak+1;
    }
}
