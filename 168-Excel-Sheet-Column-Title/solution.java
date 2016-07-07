public class Solution {
    public String convertToTitle(int n) {
        
        if(n <= 0)
            return null;
        String result = "";
        while(n != 0){
            
            char c =(char) ((n-1)%26  + 'A');
            result = c + result;
            n = (n - 1) / 26;
        }
        return result;
    }
}