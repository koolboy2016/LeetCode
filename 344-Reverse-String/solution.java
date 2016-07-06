public class Solution {
    public String reverseString(String s) {
        if(s.length() <= 1 || s == null)
            return s;
        
        int first = 0 ;
        int second = s.length() - 1 ;
        char[] stringArray = s.toCharArray();
        while(first < second){
            char temp = stringArray[first];
            stringArray[first] = stringArray[second];
            stringArray[second] = temp;
            first ++;
            second -- ;
        }
        
        return String.copyValueOf(stringArray);
    }
}