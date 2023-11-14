class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        mpp.put(sum,1);
        int cnt = 0;
        for(int i : nums) {
            sum += i;
            cnt += mpp.getOrDefault(sum - k, 0);
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}