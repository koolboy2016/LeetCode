public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (numRows == 0)
			return result;

		List<Integer> first = new ArrayList<Integer>();
		first.add(1);
		result.add(first);

		if (numRows == 1)
			return result;

		for (int i = 0; i < numRows - 1; i++) {
			List<Integer> current = new ArrayList<Integer>();
			current.add(1);
			List<Integer> pre = result.get(i);
			for (int j = 0; j < pre.size() - 1; j++) {
				int sum = pre.get(j) + pre.get(j + 1);
				current.add(sum);
			}
			current.add(1);
			result.add(current);
		}

		return result;
    }
}
