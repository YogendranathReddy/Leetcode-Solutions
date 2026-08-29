class Solution {
    public void moveZeroes(int[] nums) {
        int present_position = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] != 0) {
                nums[present_position] = nums[i];
                present_position++;
            }
        }

        while(present_position < nums.length) {
            nums[present_position] = 0;
            present_position++;
        }
    }
}
