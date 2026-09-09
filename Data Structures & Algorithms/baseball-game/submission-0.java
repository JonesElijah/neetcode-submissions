class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        //stack
        Stack<Integer> stack = new Stack<>();
        //for
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                stack.push(stack.get(stack.size()-2)+stack.peek());
            }
           else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else{
               stack.push(Integer.parseInt(operations[i]));
            }

        }
       while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}