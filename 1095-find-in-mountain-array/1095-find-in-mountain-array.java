class Solution {
     private int binarySearchAsc(MountainArray arr,
                                int target,
                                int low,
                                int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int val = arr.get(mid);

            if (val == target) return mid;

            if (val < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    private int binarySearchDesc(MountainArray arr,
                                 int target,
                                 int low,
                                 int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int val = arr.get(mid);

            if (val == target) return mid;

            if (val > target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
     public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1))
                low = mid + 1;
            else
                high = mid;
        }
        int peak = low;
        int ans = binarySearchAsc(mountainArr, target, 0, peak);
        if (ans != -1) return ans;
        return binarySearchDesc(mountainArr, target, peak + 1, n - 1);
    }
}

   