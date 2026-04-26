class Solution {
    public int findMin(int[] nums) {
        int res = nums[0];

        int left = 0;
        int right = nums.length-1;

        int mid = 0;

        while(left<=right){
            if(nums[left]<=nums[right]){
                res = Math.min(res,nums[left]);
                break;
            }

            mid = (left+right)/2;

            if(mid-1>=0 && nums[mid]<nums[mid-1]){
                res = Math.min(res,nums[mid]) ;
            }
            else if( mid+1<=nums.length-1 && nums[mid]>nums[mid+1]){
                res = Math.min(res,nums[mid+1]);
            }

            if(nums[mid]>=nums[right]){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return res;
    }
}
