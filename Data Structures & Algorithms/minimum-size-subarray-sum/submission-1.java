class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int check = 0;
        
        for(int i = 0; i < nums.length;i++){
            check += nums[i];
        }
        if(check < target){
            return 0;
        }

        int left = 0;
        int sum = 0;
        int minLen = 1000000000;

        for(int right = 0; right < nums.length ;right++){
            sum += nums[right];

            while(sum >= target){
                minLen = Math.min(right - left + 1,minLen);
                sum -= nums[left];
                left++;
            }
        }

        return minLen;
    }
}