class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        pascal.add(new ArrayList<>(tmp));
        for(int i = 1; i < numRows; i++) {
            for(int j = 0; j <= i; j++) {
                int sum = (j >= i ? 0 : pascal.get(i-1).get(j)) + (j > 0 ? pascal.get(i-1).get(j-1) : 0);
                if(tmp.size() == j) {
                    tmp.add(sum);
                }
                else {
                    tmp.set(j,sum);
                }
            }
            pascal.add(new ArrayList<>(tmp));
        }
        return pascal;
    }
}