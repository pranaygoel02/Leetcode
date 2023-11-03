class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = -1;
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) cnt++;
            else {
                maxi = Math.max(cnt, maxi);
                cnt = 0;
            }
        }
        maxi = Math.max(maxi,cnt);
        return maxi;
    }
}