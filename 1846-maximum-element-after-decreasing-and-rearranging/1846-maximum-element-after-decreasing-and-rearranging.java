class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;
        int maxi=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(!(Math.abs(arr[i] - arr[i - 1]) <= 1)){
                arr[i] = arr[i - 1]+1;
            }
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}