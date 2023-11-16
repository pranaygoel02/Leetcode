class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                int diff = -sum;
                if(set.contains(diff)) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(diff);
                    Collections.sort(tmp);
                    ans.add(tmp);
                }
                else
                    set.add(nums[j]);
            }
            set.removeAll(set);
        }               
        return new ArrayList<>(ans);
    }
}