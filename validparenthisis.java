/*
Time Complexity: O(N)
Space Complexity: O(N)
*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
            {
             a.push(')');
            }
             if(c=='[')
            {
            a.push(']');
            }
             if(c=='{')
            {
              a.push('}');  
            }
            if(c==')'||c=='}'||c==']'){
                if(a.isEmpty()||c!=a.peek()){
                    return false;
                }
                else{
                    a.pop();
                }
            }
        }
        if(!a.isEmpty()){
            return false;
        }
        return true;
    }
}