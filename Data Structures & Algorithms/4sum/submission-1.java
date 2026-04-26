class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
          int[] nums = Arrays.stream(arr).sorted().toArray();

       List<List<Integer>> result = new ArrayList<>();

       HashSet<String> set = new HashSet<>();

       for(int i =0;i<nums.length-3;i++){
           for(int j=i+1;j<nums.length-2;j++){


               int l=j+1;
               int r=nums.length-1;
      

               while(l<r){
                   long sum = nums[i];
                   sum+=nums[j];
                   sum+=nums[l];
                   sum+=nums[r];

                   if(sum==target){
                       StringBuilder s = new StringBuilder();
                       s.append(nums[i]);
                       s.append(nums[j]);
                       s.append(nums[l]);
                       s.append(nums[r]);
                       String node = s.toString();
                       if(set.contains(node)==false){
                           set.add(node);
                           result.add(List.of(nums[i],nums[j],nums[l],nums[r]));
                       }

                       l++;
                       r--;
                   }
                   else if(sum<target){
                       l++;
                   }
                   else{
                       r--;
                   }

               }

            
           }
       }
       return result;
    }
}