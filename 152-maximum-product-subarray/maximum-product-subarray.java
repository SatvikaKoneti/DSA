class Solution {
    public int maxProduct(int[] nums) {

 int maxprod = nums[0];
 int minprod = nums[0];
 int result = nums[0];
 int swap = 0 ;

 for(int i = 1 ; i < nums.length ; i++)
 {
    if(nums[i] < 0) 
    {
        swap = maxprod ;
        maxprod = minprod ;
        minprod = swap ;

    }

    maxprod = Math.max(nums[i],nums[i]*maxprod);
    minprod = Math.min(nums[i],nums[i]*minprod);

    result = Math.max(result,maxprod);
 }

 return result;
        
    }
}