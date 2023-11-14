class Solution {
    public int nCr(int n, int r) {
        int ans = 1;
        int diff = n - r;
        for(int i = 1; i <= r; i++) {
            ans = ans * n--;
            ans = ans / i;
        }
        return ans;
    }
    public List<Integer> generateRow(int row) {
        List<Integer> tmp = new ArrayList<>();
        for(int i = 1; i <= row; i++) {
            tmp.add(nCr(row - 1,i - 1));
        }    
        return tmp;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {
            pascal.add(generateRow(i));
        }
        return pascal;
    }
}