class Solution {
    fun singleNumber(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        var singleNum = 0
        for(num in nums){
            singleNum = singleNum.xor(num)
        }
        return singleNum
    }
}