class Solution {

    public int findMax(int[] arr){

        int max = -10000000;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums.length < k){
            return new int[0];
        }
        
        int[] window = new int[k];
        int[] maxArray = new int[nums.length - k + 1];

        for(int i = 0 ;i < k ; i++){
            window[i] = nums[i];
        }

        maxArray[0] = findMax(window);

        for(int right = k ; right < nums.length;right++){
            for(int i = 0; i < k-1;i++){
                window[i] = window[i+1];
            }
            window[k - 1] = nums[right];
            maxArray[right - k + 1] = findMax(window);
        }

        return maxArray;
    }
}
