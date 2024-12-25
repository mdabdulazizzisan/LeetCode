class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int single = 0;
        for (int num : nums) {
            single = single ^ num;
        }
        return single;
    }
}