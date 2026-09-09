class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      Map<Character, Character> set = new HashMap<>();
        set.put(')', '(');
        set.put('}', '{');
        set.put(']', '[');

        for(char c : s.toCharArray()){
            if(set.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == set.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
            return stack.isEmpty();
    }
}
