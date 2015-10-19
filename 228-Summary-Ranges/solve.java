public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
		if (nums == null || nums.length < 1)
			return result;

		int begin = 0;
		int end = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[end] + 1)
				end++;
			else {
				if (begin != end) {
					String s =  nums[begin] + "->" + nums[end] ;
					result.add(s);

				} else {
					String s = "" + nums[begin];
					result.add(s);
				}

				begin = i;
				end = begin;
			}
		}

		if (end == begin) {
			String s = ""+ nums[end];
			result.add(s);
		} else {
			String s =  nums[begin] + "->" + nums[end];
			result.add(s);
		}

		return result;
        
    }
}
