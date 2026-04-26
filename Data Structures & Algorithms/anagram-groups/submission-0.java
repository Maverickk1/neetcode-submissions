class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,ArrayList<String>> hmp = new HashMap<>();

        for(int i = 0; i<strs.length;i++){

            char[] s = strs[i].toCharArray();

            Arrays.sort(s);

            String sortedstring = new String(s);

            if(hmp.containsKey(sortedstring)) {
                hmp.get(sortedstring).add(strs[i]);
            }
             else{
                hmp.put(sortedstring,  new ArrayList<>(Arrays.asList(strs[i])));
                
            }
        }
        List<List<String>> lt = new ArrayList<>();
        hmp.forEach((k,v) ->lt.add(v) );

        return lt;
    }
}
