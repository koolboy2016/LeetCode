public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> result = new HashSet<Integer>();
        while(!result.contains(n)){
            result.add(n);
            if( n == 1)
                return true;
            n = sumOfdigit(n);
        }
        return false;
        
    }
    
    public int sumOfdigit(int n){
        
        int sum = 0 ;
        while(n != 0){
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
}