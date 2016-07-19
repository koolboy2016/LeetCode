public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        
        if(nums.length == 2 )
            return nums[0]>nums[1] ? nums[0]  : nums[1];
        
        int[] result = new int[nums.length] ;
        int[] robber = new int[nums.length];
        int[] unrobber = new int[nums.length];
        
        robber[0] = nums[0];
        unrobber[0] = 0 ;
        result[0] = nums[0];

        int currentRobber,currentUnrobber;
        int max = -1;
        for(int i = 1; i < nums.length; i++){

            robber[i] = unrobber[i-1] + nums[i];
            unrobber[i] = unrobber[i-1] > robber[i-1] ? unrobber[i-1] : robber[i-1];
            
            result[i] = robber[i] > unrobber[i] ? robber[i] : unrobber[i];

            if(result[i]>max)
                max = result[i];
        }
        
        return max;

    }
}