class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = Math.floorDiv(nums.length,3);
        LinkedList<Integer> majority = new LinkedList<>();

        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1; j < nums.length;j++){
                if (nums[i] >= nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int count = 1;

        for(int i = 1 ; i < nums.length;i++){
            if (nums[i] == nums[i-1]){
                count++;
            }
            else {
                if ( count > n){
                    majority.add(nums[i-1]);
                }
                
                count = 1;
            } 
        }

        if (count  > n){
            majority.add(nums[nums.length - 1]);
        } //last group needs to be checked too , the loop doesn't cover it

        return majority;

    }
}