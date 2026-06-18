class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product[] = new int[nums.length];
        int total_prod = 1;
        int zero_prod =1;
        for(int i = 0; i < nums.length;i++){
            total_prod = total_prod*nums[i];
        }

        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 0){
                for(int j = 0 ; j < i;j++){
                    zero_prod = zero_prod*nums[j];
                }
                for(int j = i+1; j < nums.length;j++){
                    zero_prod = zero_prod*nums[j];
                }
                product[i] = zero_prod;
            }
            else product[i] = total_prod/nums[i];
        }

    return product;
    }
}  
