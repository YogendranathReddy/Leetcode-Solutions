class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged_array = new int[n+m];
        int indexing = 0;
        for(int i = 0;i < m;i++) {
            merged_array[indexing] = nums1[i];
            indexing++;
        }
        for(int i = 0;i < n;i++) {
            merged_array[indexing] = nums2[i];
            indexing++;
        }

        java.util.Arrays.sort(merged_array);

        for(int i = 0;i < nums1.length;i++) {
            nums1[i] = merged_array[i];
        }

    }
}
