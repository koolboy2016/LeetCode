public class Solution {
    public boolean isPalindrome(String s) {
            
        if(s == null || s =="")
            return true;
            
        char[] charStrings = s.toCharArray(); 
        int i = 0 ;
        int j = charStrings.length - 1;
        
        while(i < j){
            while(!isVaild(charStrings[i]) && i<j)
                i++;
            while(!isVaild(charStrings[j]) && i<j)
                j--;
            
            if(charStrings[i] >= 'A' && charStrings[i] <= 'Z')
                charStrings[i] += ('a' - 'A');
                
            if(charStrings[j] >= 'A' && charStrings[j] <= 'Z')
                charStrings[j] += ('a' - 'A');
                
            if(charStrings[i] != charStrings[j])
                return false;
            i++;
            j--;
        }
        return true;
        
        
    }
    
    public boolean isVaild(char c){
        if(c >= 'a' && c <= 'z') 
            return true;
        if(c >= 'A' && c <= 'Z')
            return true;
        if(c >= '0' && c<= '9')
            return true;
        return false;
    }
    
    
}