class Solution {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public boolean kthPermutation(int[] arr) {

        int index = -1;
        int n = arr.length;

        // Find the pivot
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // Already the last permutation
        if (index == -1) {
            return false;
        }

        // Find the smallest element greater than arr[index]
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }

        // Reverse the suffix
        reverse(arr, index + 1, n - 1);

        return true;
    }

    public String getPermutation(int n, int k) {

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < k - 1; i++) {
            if (!kthPermutation(array)) {
                break;
            }
        }

        String s = "";

        for (int num : array) {
            s += num;
        }

        return s;
    }
}