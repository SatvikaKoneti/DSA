class Solution {
    public int jump(int[] nums) {

        int count = 0;
        int maxind = 0;
        int curind = 0 ;

        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            if(i > maxind)
            {
                return -1;
            }

            else
            {
                maxind = Math.max(maxind , i + nums[i]);
            }

            if(i == curind)
            {
                curind = maxind;
                count++;
            }
        }

        return count;
        
    }
}