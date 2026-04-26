class Solution {
    public void reverseString(char[] s) {
        if(s.length>2){
        // int rm = s.length%2;
        // int n;
        // if(rm==0){
        //     n=s.length/2;
        // }
        // else{
        //     n=(s.length-1)/2;
        // }
        int i=0;
        int j = s.length-1;
        char c;
        while(j>i){
            c = s[i];
            s[i]= s[j];
            s[j]= c;
            i++;
            j--;
        }
        }
        else if(s.length==2){
            char c = s[0];
            s[0]=s[1];
            s[1]=c;
        }
    }
}