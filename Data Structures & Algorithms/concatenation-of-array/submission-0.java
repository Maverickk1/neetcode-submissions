class Solution {
    public int[] getConcatenation(int[] nums) {
        int ct = 2*nums.length;
       int n= nums.length;
        int[] ans = new int[ct];
        for(int i = 0; i<n; i++){
                ans[i] = nums[i];
                ans[i+n] = nums[i];
        }
        return ans;
    }
}