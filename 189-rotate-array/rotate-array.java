class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = n - (k % n); // left rotations
        int a1[] = new int[k];
        for(int i = 0; i < k; i++) {
            a1[i] = nums[i];
        }
        for(int i = k; i < n; i++) {
            nums[i-k] = nums[i];
        }
        for(int i = n-k; i < n; i++)
            nums[i] = a1[i - (n-k)];
    }
}