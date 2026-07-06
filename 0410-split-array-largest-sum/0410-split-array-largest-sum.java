class Solution {
       public int posible(int[] nums,int mid){
        int student=1;
        int pagesSt=0;
        for (int i=0;i<nums.length;i++)
        {
            if(pagesSt+nums[i]<=mid){
                pagesSt+=nums[i];
            }
            else
            {
                student++;
                pagesSt=nums[i];
            }
        }
        return student;
    }
       public int sum(int []nums){
        int sums=0;
        for(int ele:nums){
            sums+=ele;
        }
        return sums;
    }
        public int max(int []nums){
        int maxi = Integer.MIN_VALUE;
        for(int ele:nums){
            maxi=Math.max(maxi,ele);
        }
        return maxi;
    }
public int findPages(int[] nums, int m) {
   int low=max(nums);
   int high=sum(nums);
   while(low<=high){
    int mid=(low+high)/2;
    if(posible(nums,mid)>m){
        low=mid+1;
    }
    else{
        high=mid-1;
    }
       }
       return low;
    }
    public int splitArray(int[] nums, int k) {
        return findPages(nums,k);
    }
}

    