class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums.length < 4)
            return false;
        int state = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (state == 0) {
                if (nums[i] < nums[i + 1]) {

                } else if (i > 0 && nums[i] > nums[i + 1]) {
                    state = 1;
                } else {
                    return false;
                }
            } else if (state == 1) {
                if (nums[i] > nums[i + 1]) {
                } else if (nums[i] < nums[i + 1]) {
                    state = 2;
                } else {
                    return false;
                }
            } else if (state == 2) {
                if (nums[i] < nums[i + 1]) {

                } else {
                    return false;
                }
            }
        }
        return state == 2;
    }
}