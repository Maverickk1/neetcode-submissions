class Solution {
    public String longestCommonPrefix(String[] strs) {

    int l = Integer.MAX_VALUE;
    int index = 0;
    for(int i=0;i<strs.length;i++)
    {
        if(strs[i].length()<l){
            l = strs[i].length();
            index = i;    
        }
    }

    

    String mstr = strs[index];

    for(int i=0; i<strs.length;i++){
        
        for(int j=0; j<strs[i].length();j++){

        if(mstr.equals(strs[i].substring(0,mstr.length())))
        {
            continue;
        }
        else{
            mstr = mstr.substring(0,mstr.length()-1);
        }
        }
   
        
    }

    return mstr;
    }
}