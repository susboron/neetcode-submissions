class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int max = 0;
        for(int i = 0;i < heights.length;i++){
            for(int j = i +1; j < heights.length;j++){
                
                int width = j - i;
                int height = 1;
                if ( heights[i] < heights[j]){
                    height = heights[i];
                } else {
                    height = heights[j];
                }

                area = width*height;

                if( area > max){
                    max = area;
                }
            }
        }

        return max;
    }
}
