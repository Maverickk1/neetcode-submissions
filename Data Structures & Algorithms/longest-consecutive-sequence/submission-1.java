class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i :arr){
            hashSet.add(i);
        }

        int longest = 0;

 
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(!hashSet.contains(num-1)){
               int current = num;
               int count = 1;

               while(hashSet.contains(current+1)){
                   current++;
                   count++;
               }
               longest = Math.max(longest,count);
            }

        }
        return longest;
    }
}
