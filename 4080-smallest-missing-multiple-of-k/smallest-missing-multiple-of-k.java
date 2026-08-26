class Solution {
    public int missingMultiple(int[] nums, int k) {

        ArrayList<Integer> l = new ArrayList<>();


        for(int i = 0 ; i < nums.length ; i++)
        {
            l.add(nums[i]);

        }

        int p = k ;
        while(l.contains(p))
        {
            p += k;
        }

        return p;
        
    }
}