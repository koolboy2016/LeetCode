public class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 1)
            return s;
        int length = s.length();
        char[] arrays = s.toCharArray();
        int left = 0  ;
        int right = length - 1 ;
        while(left < right){
            
            if(IsVowel(arrays[left]) && IsVowel(arrays[right])){
                char temp = arrays[left];
                arrays[left] = arrays[right];
                arrays[right] = temp;
                left ++;
                right --;
            }
            else{
                if(!IsVowel(arrays[left]))
                    left ++;
                if(!IsVowel(arrays[right]))
                    right--;
            }
             
        }
        return String.valueOf(arrays);
        
    }
    
    public boolean IsVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c=='o' || c=='u' || c == 'A' || c == 'E' || c =='I' || c =='O' || c== 'U')
            return true;
        else
            return false;
    }
}