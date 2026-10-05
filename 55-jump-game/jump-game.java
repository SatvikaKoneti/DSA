class Solution {
    public boolean canJump(int[] nums) {

        int maxindx = 0 ;

        for(int i = 0 ; i<nums.length ; i++)
        {

            if(i > maxindx)
            {
                return false;
            }

            else
            {
                maxindx = Math.max(maxindx , i + nums[i]);
            }
        } 

        return true ;
        
    }
}