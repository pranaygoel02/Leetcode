class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pi = 0, ni = 1;
        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                ans[ni] = nums[i];
                ni += 2;
            }
            else {
                ans[pi] = nums[i];
                pi += 2;
            }
        }
        return ans;
    }
}