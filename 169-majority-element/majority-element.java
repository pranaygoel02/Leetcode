class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0], cnt = 0;
        for(int i : nums) {
            if(cnt == 0) {
                ele = i;
            }
            if(i == ele) cnt++;
            else cnt--;
        }
        return ele;
    }
}