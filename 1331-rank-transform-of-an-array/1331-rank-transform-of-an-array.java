class Solution {
    
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0)
        return arr;
        int[] copy=Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
         map.put(copy[0],rank);
        for(int i=1;i<copy.length;i++)
        {
            if(copy[i]>copy[i-1])
            {
                rank+=1;
            }

            map.put(copy[i],rank);

        }
    
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}