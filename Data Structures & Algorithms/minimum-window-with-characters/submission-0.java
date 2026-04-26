class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<>();

        int finallen = Integer.MAX_VALUE;

        StringBuilder finalstr = new StringBuilder();

        int start = -1;
        int end = -1;

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int count = map.size();

        int i = -1;
        int j = -1;

        while(true){
            boolean f1 = false;
            boolean f2 = false;

            while (i < s.length()-1) {
                f1=true;
                i++;
                char letter = s.charAt(i);
          

                if (map.containsKey(letter)) {
                    map.put(letter, map.getOrDefault(letter, 0) - 1);
                    if (map.get(letter) == 0) {
                        count--;
                    }
                }
                if(count==0){
                    break;
                }


            }
            while (j<i){
                f2=true;
                j++;
                char letter = s.charAt(j);
          
                if(map.containsKey(letter)){
                    
                    if(map.get(letter)==0 && count==0){
                        int len = i-j;
                       
                        if(len<finallen){
                            finallen = len;
                            start =j;
                            end =i;
                        }
                        map.put(letter,map.get(letter)+1);
                    }
                    else{
                        map.put(letter, map.get(letter) + 1);
                    }

                    // if it becomes > 0 → window invalid
                    if (map.get(letter) > 0) {
                        count++;
                        break;// stop shrinking
                    }
                }
            }


            if(f1==false && f2==false){
                break;
            }
        }





        if (start != -1) {
            return s.substring(start, end + 1);
        }
        return "";
    }
}
