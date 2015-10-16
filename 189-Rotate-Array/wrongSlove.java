public class Solution {
    public void rotate(int[] nums, int k) {
	if (k == 0 || k == nums.length)
			return;
		int length = nums.length;
		int rotateIndex = length - k;

		for (int step = 0; step < k; step++) {

			int temp = nums[rotateIndex + step];
			for (int j = 0; j < length - k; j++) {
				nums[rotateIndex + step - j] = nums[rotateIndex + step - j - 1];
			}
			nums[step] = temp;
		}

		return;
		}
}
