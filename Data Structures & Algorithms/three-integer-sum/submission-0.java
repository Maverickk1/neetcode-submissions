class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        int[] nums = Arrays.stream(arr).sorted().toArray();

       List<List<Integer>> result = new ArrayList<>();

       for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k = nums.length-1;
            int target = 0-nums[i];

           if(i!=0  && nums[i]==nums[i-1]) {
               continue;
           }
            
            while(j<k) {

                if(j!=i+1  && nums[j]==nums[j-1]) {
	        		j++;
	    			continue;
	    		}

                if (nums[j] + nums[k] == target) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (nums[j] + nums[k] > target) {
                    if (k == j) {
                        break;
                    }
                    k--;

                } else if (nums[i] + nums[j] < target) {
                    if (k == j) {
                        break;
                    }
                    j++;
                }

            }
       }

       return result;

    }
}
