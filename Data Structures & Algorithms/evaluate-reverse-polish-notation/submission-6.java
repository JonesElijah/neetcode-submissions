class Solution {
    public int evalRPN(String[] tokens) {
        //Stack
        Stack<Integer> stack = new Stack<>();
        //iterate 
        //if operator, pop twice
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(tokens[i].equals("-")){
            int pop1 = stack.pop();
            int pop2 = stack.pop();
                stack.push(pop2 - pop1);            }
           else if(tokens[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
           else if(tokens[i].equals("/")){
            int pop1 = stack.pop();
            int pop2 = stack.pop();
                stack.push(pop2 / pop1);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();

    }
}
