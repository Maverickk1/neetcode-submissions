class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;

        int result = 0;

        int leftindex= l;
        int rightindex= r;

        while(l<r){
            int width = r-l;
            int area =  Math.min(height[l],height[r])*width;
           if(area> result){
               result = area;
           }
           if(height[l]<height[r]){
               l++;
           }
           else{
               r--;
           }
        }


       return result;
    }
}
