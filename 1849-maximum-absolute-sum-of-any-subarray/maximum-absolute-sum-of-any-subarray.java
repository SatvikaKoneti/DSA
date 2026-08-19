class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxsum = 0 ;
        int minsum  = 0 ;
        int result = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            maxsum = Math.max(nums[i],nums[i]+maxsum);
            minsum = Math.min(nums[i],nums[i]+minsum);
            result = Math.max(result,Math.max(maxsum,Math.abs(minsum)));
        }
        
        

        return result  ;
    }
}