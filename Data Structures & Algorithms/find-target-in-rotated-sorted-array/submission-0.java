class Solution {
    public int search(int[] nums, int target) {
        int res = -1;

        int left = 0;
        int right = nums.length-1;

        int mid ;

        while(left<=right){
            mid = (left+right)/2;
            System.out.println("left:"+left+"right:"+right+"mid:"+mid);
            if(nums[mid]==target){
                res = mid;
                break;
            }
            else if(nums[mid]>=nums[left]){
                if(target<nums[mid] && target>=nums[left]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else if(nums[right]>=nums[mid]){
                if(target>nums[mid] && target<=nums[right]){
                    left = mid+1;
                }
                else{
                    right= mid-1;
                }
            }

        }
       
        return res;
    }
}
