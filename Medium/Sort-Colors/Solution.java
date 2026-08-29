class Solution {
    public void sortColors(int[] nums) {
      int count_red = 0;
      int count_white = 0;
      int count_blue = 0;

      for (int i = 0 ; i < nums.length ; i++) {
        if (nums[i] == 0) {
            count_red++;
        } else if (nums[i] == 1) {
            count_white++;
        } else if (nums[i] == 2) {
            count_blue++;
        }
      }

      int index = 0;

      for (int j = 0 ; j < count_red ; j++) {
        nums[index] = 0;
        index++; 
      }

      for (int j = 0 ; j < count_white ; j++) {
        nums[index] = 1;
        index++; 
      }

      for (int j = 0 ; j < count_blue ; j++) {
        nums[index] = 2;
        index++; 
      }

    }
}
