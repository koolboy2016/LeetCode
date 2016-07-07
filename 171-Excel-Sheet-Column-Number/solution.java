public class Solution {
    public int titleToNumber(String s) {
        if(s == null)
            return 0;
        int length = s.length();
        int result = 0 ;
        char temp;
        for(int i =0 ; i<=length-1;i++){
            temp = s.charAt(i);
            int t = temp - 'A' + 1;
            result = result*26 + t;
        }
        return result;
    }
}