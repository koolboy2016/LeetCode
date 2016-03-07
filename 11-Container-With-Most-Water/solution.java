package org.ElventoTwenty;

/**
 * 
 * @author Hao
 * 
 * @date 3.7
 * 
 * 
 *       找到最大的容积容纳更多水
 */

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] height = { 1, 1 };
		System.out.println("The Result is : " + maxArea(height));
	}

	public static int maxArea(int[] height) {

		if (height.length < 2)
			return 0;

		int leftIndex = 0;
		int rightIndex = height.length - 1;
		int maxResult = 0;

		while (leftIndex < rightIndex) {

			int currentResult = Math.min(height[leftIndex], height[rightIndex])
					* (rightIndex - leftIndex);
			if (currentResult > maxResult)
				maxResult = currentResult;

			if (height[leftIndex] < height[rightIndex]) {
				leftIndex++;
				while (leftIndex < rightIndex
						&& height[leftIndex] <= height[leftIndex - 1])
					leftIndex++;
			} else {
				rightIndex--;
				while (leftIndex < rightIndex
						&& height[rightIndex] <= height[rightIndex + 1])
					rightIndex--;
			}

		}

		return maxResult;
	}

	/*
	 * 测试++性能，可以在while语句中不用任何语句，直接进行无限循环
	 */
	public static void Test() {

		int a = 1;
		int b = 1;
		System.out.println(a < a++);

	}
}
