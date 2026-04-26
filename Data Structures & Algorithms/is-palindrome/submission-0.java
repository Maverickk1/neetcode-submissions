class Solution {
    public boolean isPalindrome(String s) {
        String sentence = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed =  new StringBuilder(sentence.toLowerCase()).reverse().toString();


        System.out.println(reversed);
        System.out.println(sentence);
        if(sentence.equals(reversed)){
           return true;
        }
        else{
            return false;
        }

    }
}
