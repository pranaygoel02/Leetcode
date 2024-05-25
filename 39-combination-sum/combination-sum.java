class Solution {
    public static void getCombos(int index, int ar[], int t, List<Integer> ls, List<List<Integer>> res) {
        if(index == ar.length) {
            if(t == 0) {
                res.add(new ArrayList<>(ls));
            }
            return;
        }
        if(ar[index] <= t) {
            ls.add(ar[index]);
            getCombos(index, ar, t - ar[index], ls, res);
            ls.remove(ls.size() - 1);
        }
        getCombos(index + 1, ar, t, ls, res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        getCombos(0, candidates, target, new ArrayList<Integer>(), res);
        return res;
    }
}