public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;
        count += n&0x01;
        n >>>= 1;
        while(n > 0){
            count += n&0x01;
            n >>>= 1;
        }
        return count;
    }
}