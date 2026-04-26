class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character,Integer> hmp  = new HashMap<>();
        
        final boolean flag = true;

        for(char c: s.toCharArray()){
            if(hmp.containsKey(c)){
                hmp.put(c, hmp.get(c)+1);
            }
            else{
                hmp.put(c,1);
            }
        }

        for(char c: t.toCharArray()){
            if(hmp.containsKey(c)){
                hmp.put(c, hmp.get(c)-1);
            }
            else{
                hmp.put(c,-1);
            }
        }

        return hmp.values().stream().allMatch(n -> n==0);

        // hmp.forEach((k,v) -> {
        //     if(v!=0){
        //         flag= false;
        //     }
        // });

         

    }
}
