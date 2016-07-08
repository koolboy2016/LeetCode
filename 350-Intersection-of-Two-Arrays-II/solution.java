public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int length1 = nums1.length;
		int length2 = nums2.length;
		List<Integer> result = new ArrayList<Integer>();

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int firstpoint = 0;
		int secondpoint = 0;

		while (firstpoint < length1 && secondpoint < length2) {
			if (nums1[firstpoint] > nums2[secondpoint])
				secondpoint++;
			else if (nums1[firstpoint] < nums2[secondpoint])
				firstpoint++;
			else {
				result.add(nums1[firstpoint]);
				firstpoint++;
				secondpoint++;
			}
		}
		int[] resultarray = new int[result.size()];

		for (int i = 0; i < resultarray.length; i++)
			resultarray[i] = result.get(i);

		return resultarray;
    }
}