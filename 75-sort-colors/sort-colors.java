class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
       int low = 0, mid = 0, high = n -1; 
        while(mid <= high) {
            if(nums[mid] == 0) {
                int tmp = nums[mid] ;
                nums[mid] = nums[low];
                nums[low] = tmp;
                low++; mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = tmp;
                high--;
            }
        }
    }
}