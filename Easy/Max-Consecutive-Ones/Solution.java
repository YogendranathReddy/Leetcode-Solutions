class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_Count = 0;
        int count = 0;
        for(int n : nums) {
            if(n == 1) {
                count +=1;
                max_Count = Math.max(max_Count, count);
            }
            if(n == 0) {
                count = 0;
            }

        }
        return max_Count;
    }
}
