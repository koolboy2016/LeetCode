public class Solution {
    public int compareVersion(String version1, String version2) {
     
         String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");

		int minlength = ver1.length < ver2.length ? ver1.length : ver2.length;

		for (int i = 0; i < minlength; i++) {

			int a = stringToint(ver1[i]);
			int b = stringToint(ver2[i]);
			if (a > b)
				return 1;
			else if (a < b)
				return -1;
			else 
			    continue;
		}

		if (ver1.length > ver2.length){
		    
		    for(int i = minlength; i < ver1.length; i ++){
		        if(stringToint(ver1[i]) != 0)
		            return 1;
		    }
		    return 0;
		}else if(ver1.length < ver2.length){
		    for(int i = minlength; i< ver2.length ; i ++){
		        if(stringToint(ver2[i]) != 0)
		            return -1;
		    }
		    return 0;
		}
		else 
		    return 0 ;
    }
    public int stringToint(String s) {

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 10 + s.charAt(i) - '0';
		}
		return result;
	}
}

