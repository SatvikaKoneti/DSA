class Solution {
    public void sortColors(int[] nums) {

      int val = 0 ;
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            for(int j = i + 1 ; j < nums.length ; j++)
            {

                if(nums[i] > nums[j])
                {
                    val = nums[i];  // save nums[i]
                    nums[i] = nums[j];  // put nums[j] into nums[i]
                    nums[j] = val;      // put old nums[i] into nums[j]
                }

                val = 0 ;

                

                

            }
            
        }
        
    }
}