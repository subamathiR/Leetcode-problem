import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int i:nums)
       {
        if(i>0)
        set.add(i);
       }
       int s=1;
       while(true)
       {
       if(!set.contains(s))
        {
            return s;
        }
        s++;
       }
    }
}