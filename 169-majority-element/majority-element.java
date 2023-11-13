class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i : nums) {
            if(mpp.get(i) != null)
                mpp.put(i, mpp.get(i) + 1);
            else mpp.put(i, 1);
        }
        int maxi = 0, ele = -1;
        for(int i : mpp.keySet()) {
            int val = mpp.get(i);
            if(val > maxi) {
                maxi = val;
                ele = i;
            }
        }
        return ele;
    }
}