class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pi = new ArrayList<>();
        List<Integer> ni = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                ni.add(nums[i]);
            }
            else {
                pi.add(nums[i]);
            }
        }
        for(int i = 0; i < n; i++) {
            nums[i] = i % 2 == 0 ? pi.get((int)i/2) : ni.get((int)i/2);
        }
        return nums;
    }
}