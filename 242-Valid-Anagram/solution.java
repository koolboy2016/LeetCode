import java.util.Hashtable;
public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())
			return false;

		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			temp = String.valueOf(s.charAt(i));
			if (!table.containsKey(temp))
				table.put(temp, 0);
			int oldvalue = table.get(temp);
			table.replace(temp, oldvalue + 1);
		}

		for (int i = 0; i < t.length(); i++) {
			temp = String.valueOf(t.charAt(i));
			if (!table.containsKey(temp))
				return false;
			else {
				int oldvalue = table.get(temp);
				if (oldvalue == 1)
					table.remove(temp);
				else
					table.replace(temp, oldvalue - 1);
			}
		}

		if (table.isEmpty())
			return true;
		else
			return false;
        
    }
}