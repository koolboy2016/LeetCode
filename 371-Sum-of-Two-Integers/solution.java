public class Solution {
    public int getSum(int a, int b) {
        
        // ������
        int newa = a ^ b ;
        // �����λ
        int newb = (a & b) << 1 ;
        if (newb != 0 )
            return getSum(newa,newb);
        return newa ;
        
    }
}