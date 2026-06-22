class Solution {
    public int firstMissingPositive(int[] nums) {
        int minimum = 1; //first missing positive asked, so starts from 1 not nums[0] or 0
        boolean found;

        while(true){
            found = false;

            for(int num : nums){
                if(num == minimum){
                    found = true;
                    break;
                }
            }

        if(!found) return minimum;
        minimum++;
        }
    }
}