class Solution {
    // TC - O(n)
    // SC - O(n)
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int beg = 0, end = n-1, i = n-1;
        while (i>=0){
            if(nums[beg] * nums[beg] > nums[end] * nums[end]){
                result[i--] = nums[beg] * nums[beg];
                beg++;
            }
            else{
                result[i--] = nums[end] * nums[end];
                end--;
            }
        }
        return result;
    }
}