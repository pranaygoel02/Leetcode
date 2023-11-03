class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(Integer i: nums) {
            System.out.print(i);
            if(mp.containsKey(i)) mp.put(i, mp.get(i) + 1);
            else mp.put(i, 1);
        }
        for(Integer i : mp.keySet()) {
            if (mp.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}