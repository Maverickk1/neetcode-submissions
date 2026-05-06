class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals,(a, b) -> Integer.compare(a[0],b[0]));

        List<List<Integer>> arr = new ArrayList<>();
        int[] current = intervals[0];

        for(int i=1;i<intervals.length;i++){
            List<Integer> ans = new ArrayList<>();
            if(current[1]>=intervals[i][0]){
                current[1] = Math.max(current[1],intervals[i][1]);
            }
            else{
                arr.add(Arrays.asList(current[0],current[1]));
                current = intervals[i];

            }
        }

        arr.add(Arrays.asList(current[0],current[1]));
       

        int[][] merged = new int[arr.size()][2];

        for (int i = 0; i < arr.size(); i++) {
            merged[i][0] = arr.get(i).get(0);
            merged[i][1] = arr.get(i).get(1);
        }

     
        return merged;

    }
}
