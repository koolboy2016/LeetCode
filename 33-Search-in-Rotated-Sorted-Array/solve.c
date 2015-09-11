class Solution {
public:
    int search(vector<int>& nums, int target) {
        
        if (nums.size() == 0)
            return -1;
        int begin = 0;
        int end = nums.size() -1;
        int mid = -1;
        while (begin <= end){
            mid = (begin + end) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[begin] <= nums[mid]){
                if ( target < nums[mid] && target >= nums[begin] )
                    end = mid -1;
                else
                    begin = mid + 1;
            }
            else{
                if( target > nums[mid] && target <= nums[end])
                    begin = mid + 1;
                else
                    end = mid - 1;
            }
        }
        
       return -1;
        
        
    }
};
