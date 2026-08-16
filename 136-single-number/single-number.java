class Solution {
    public int singleNumber(int[] nums) {

    int fin = 0 ;

    for(int i = 0 ; i < nums.length ; i++)
    {
        fin = fin ^ nums[i];
        //basically ^ means xor 
        //so 2 = 0 ^ 2 ;
        //then 0 = 2 ^ 2 ;
        //then 1 = 0 ^ 1 ;
        //result is 1 ;
    }

    return fin ;
        
    }
}