class Solution {
    public int lengthOfLongestSubstring(String s) {
        int finallen = 0;
        Map<Character,Integer> map = new HashMap<>();

        int i=-1;
        int j=-1;
        
        while(true){
            boolean f1=false;
            boolean f2 = false;

        while(i<s.length()-1){
            f1=true;

            i++;
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);


            if(map.get(s.charAt(i))==2){
                break;
            }
            else{
                int len = i-j;
                if(len>finallen){
                    finallen = len;
                }
            }
        }

        while (j<i){
            f2=true;
            j++;
            char ch = s.charAt(j);
           
                map.put(ch,map.get(ch)-1);
            

            if(map.get(ch)==1){
                break;
            }

        }

        if(f1==false && f2==false){
            break;
        }
        }
        return finallen;
    }
}
