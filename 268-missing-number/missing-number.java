class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length ;
        Arrays.sort(nums);
        int store = 0;

        if(nums[nums.length - 1] != nums.length)
        {
            return nums.length;
        }
        if(nums[0] != 0)
        {
            return 0;
        }


        for(int i = 0 ; i < nums.length  ; i++)
        {
            if(nums[i] != i )
            {
                store = i;
                return store;
            }

        }

    return store;
        
    }
}