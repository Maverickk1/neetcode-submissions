
class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        Set<Integer> hmp = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(hmp.contains(nums[i])){
                return true;
            }
            hmp.add(nums[i]);
        }
        return false;
        
    }
}