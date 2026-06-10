class Solution {
    public int majorityElement(int[] nums) {
        int value = 0;
        int count = 0;
        int answer = 0;

        for(int i = 0;i < nums.length;i++){
            value = nums[i];
            count = 1;
            for(int j = i+1; j <nums.length;j++){
                if(nums[j] == value){
                    count++;
                }
                if(count > (nums.length)/2){
                    return value;
                }
                
            }

        }

    return value;

    }
}