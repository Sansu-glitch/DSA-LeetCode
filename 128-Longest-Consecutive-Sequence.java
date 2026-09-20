class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlength  = 1;
        int count = 1;

        Arrays.sort(nums);
        if(nums.length == 0) {
            return 0;
        }
        for (int i = 1;i<nums.length;i++) {
           if(nums[i] == nums[i-1]+1) {
            count++;
           }else if (nums[i] == nums[i-1]) {

           }else {
            count = 1;
           }
           maxlength = Math.max(count,maxlength);
            
        }
        return maxlength;


        
    }
}