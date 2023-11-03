class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(i < nums.length - 1 && nums[i] == nums[i+1]) continue;
            nums[count++] = nums[i];
        }
        return count;
    }
}