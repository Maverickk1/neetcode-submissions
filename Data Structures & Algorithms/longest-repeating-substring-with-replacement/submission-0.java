class Solution {
    public int characterReplacement(String s, int k) {
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

                int len = i-j;
                Integer freq = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();


                if(len-freq<=k){
                     if(finallen<len){
                        finallen = len;
                    }

                }
                else{
                   break;
                }
            }

            while (j<i){
                f2=true;
                j++;
                char ch = s.charAt(j);

                map.put(ch,map.get(ch)-1);

                Integer freq = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();

                int len =i-j;
                if(len-freq<=k){
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
