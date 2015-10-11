public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
	if (k < 1 || t < 0 || nums.length < 2)
			return false;

		TreeSet<Integer> treeset = new TreeSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			if ((treeset.floor(temp) != null && (long) temp - treeset.floor(temp) <= t)
					|| (treeset.ceiling(temp) != null && (long) treeset.ceiling(temp) - temp <= t)) {

				return true;
			}
			treeset.add(temp);
			if (i >= k)
				treeset.remove(nums[i - k]);
		}

		return false;
    }
}
