class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> range=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            range.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!range.contains(i))
            return i;
        }

        return nums.length+1;
    //     int sum=0;
    //     int pos=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(nums[i]>0)
    //         {
    //             pos++;
    //             sum+=nums[i];
    //         }
    //     }

    //     int checksum=(pos+1)*(pos+2)/2;
       
    //   if(checksum-sum>0)
    //   {
    //     return checksum-sum;
    //   }
    //  HashSet<Integer> set=new HashSet<>();

     
}
}