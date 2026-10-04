class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int slen = s.length;
        int glen = g.length;
        int i = 0 ;
        int j = 0 ;

        Arrays.sort(g);
        Arrays.sort(s);



        while(i < slen && j < glen)
        {
            if(s[i] >= g[j])
            {
                i = i + 1;
                j = j + 1;

                
            }
            

            else
            {
                i++;
            }
            
        }

        return j;
        
    }
}