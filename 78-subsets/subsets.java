class Solution {
    public static void test(int index, int[] nums, List<List<Integer>> ans, List<Integer> ls) {
        if(index == nums.length) {
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[index]);
        test(index + 1, nums, ans, ls);
        ls.remove(ls.size() - 1);
        test(index + 1, nums, ans, ls);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        test(0,nums,ans,new ArrayList<>());
        return ans;
    }
}