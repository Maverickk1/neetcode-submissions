class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length();i++){
            char val = s.charAt(i);

            if(val=='('){
                stack.push(val);
            }
            if(val=='{'){
                stack.push(val);
            }
            if(val=='['){
                stack.push(val);
            }
            else if(val==')'){
                if(stack.isEmpty()){
                    return false;
                } else if (stack.peek().equals('(')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else if(val=='}'){
                if(stack.isEmpty()){
                    return false;
                } else if (stack.peek().equals('{')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else if(val==']'){
                if(stack.isEmpty()){
                    return false;
                } else if (stack.peek().equals('[')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }


        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
