public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
 List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums == null || nums.length < 3)
			return result;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			if (i != 0 && nums[i] == nums[i - 1])
				continue;

			int start = i + 1;
			int end = nums.length - 1;

			while (start < end) {

				int sum = nums[i] + nums[start] + nums[end];
				if (sum == 0) {

					List<Integer> temp = new ArrayList<Integer>();
					temp.add(nums[i]);
					temp.add(nums[start]);
					temp.add(nums[end]);

					result.add(temp);

					start++;
					end--;

					while (start < end && nums[start - 1] == nums[start]) {
						start++;
					}

					while (start < end && nums[end + 1] == nums[end]) {
						end--;
					}
				} else if (sum > 0) {
					end--;
				} else {
					start++;
				}
			}
		}

		return result;
    }
}
