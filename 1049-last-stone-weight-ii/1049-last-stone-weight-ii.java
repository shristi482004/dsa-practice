class Solution {
    public ArrayList<Integer> subsetsum(int arr[],int sum) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[][] t=new boolean[arr.length+1][sum+1];
        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                if(i==0 && j==0)
                t[i][j]=true;
                else if(i==0)
                t[i][j]=false;
                else if(j==0)
                t[i][j]=true;
            }
        }
        for(int i=1;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(arr[i-1]<=j)
                t[i][j]=t[i-1][j]||t[i-1][j-arr[i-1]];
                
                else 
                t[i][j]=t[i-1][j];
            }
        }
         for(int j=0;j<=sum/2;j++)
            {
                if(t[arr.length][j]==true)
                ans.add(j);
            }
        
        return ans;
        
    }
    public int minDifference(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];
        
        int min=Integer.MAX_VALUE;
        ArrayList<Integer> possible=subsetsum(arr,sum);
        for(int i=0;i<possible.size();i++)
        {
            min=Math.min(min,sum-2*possible.get(i));
        }
        return min;
    }
    public int lastStoneWeightII(int[] stones) {
        return minDifference(stones);
    }
}