public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int lengtha = nums1.length;
        int lengthb = nums2.length;
        
        HashSet<Integer> hashset = new HashSet<Integer>();
        int aIndex = 0;
        int bIndex = 0;
        
        while(aIndex<lengtha && bIndex<lengthb){
            
            if(nums1[aIndex] > nums2[bIndex])
                bIndex ++;
            else  if(nums1[aIndex] < nums2[bIndex])
                aIndex ++;
            else{
                hashset.add(nums1[aIndex]);
                aIndex ++;
                bIndex ++;
            }
        }
        int[] result = new int[hashset.size()];
        int index = 0;
        for(int c : hashset){
            result[index] = c;
            index ++;
        }
        return result;

        
    }
}