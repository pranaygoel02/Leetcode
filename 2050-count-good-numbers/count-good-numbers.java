class Solution {
    public long power(long x, long y, int mod) {
        long res = 1;
        long _y = y;
        y = Math.abs(y);
        while(y > 0) {
            if((y & 1) != 0) {
                res = (res * x) % mod;
            }
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res % mod;
    }
    public int countGoodNumbers(long n) {
        int mod = (int)(1e9) + 7;
        long o = power(5,(n+1)/2, mod);
        long e = power(4,n/2, mod);
        return (int)((e * o) % mod);
    }
}