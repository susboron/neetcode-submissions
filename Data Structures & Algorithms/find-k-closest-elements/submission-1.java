class Solution {

    private int lowerBound(int[] arr, int x) {
        int left = 0, right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        LinkedList<Integer> list = new LinkedList<>();
        int pos = lowerBound(arr,x);

        int left = pos-1;
        int right = pos;

        for(int i = 0; i < k ; i ++){
            if( left<0){
                list.addLast(arr[right]);
                right++;
            } 
            else if (right == arr.length){
                list.addFirst(arr[left]);
                left --;
            }
            else if (Math.abs(arr[left]-x) <= Math.abs(arr[right]-x)){
                list.addFirst(arr[left]);
                left--;
            }
            else{
                list.addLast(arr[right]);
                right++;
            }

        }
        
        return list;
    }
}