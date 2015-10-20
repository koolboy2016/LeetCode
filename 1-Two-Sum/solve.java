import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
		int[] result = new int[2];

		Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (hashtable.containsKey(target - nums[i])) {
				result[0] = hashtable.get(target - nums[i]) + 1;
				result[1] = i + 1;
			}
			hashtable.put(nums[i], i);

		}
		return result;
    }
}
