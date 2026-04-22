class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    int nums1 , nums2;
    for(String i : tokens){
            switch(i){
                case "+" ->{
                    stack.add(stack.pop()+stack.pop());
                }
                case "-" -> {
                    nums1 = stack.pop();
                    nums2 = stack.pop();
                    stack.add(nums2-nums1);
                }
                case "*" ->{
                    stack.add(stack.pop()*stack.pop());
                }
                 case "/" -> {
                    nums1 = stack.pop();
                    nums2 = stack.pop();
                    stack.add(nums2/nums1);
                }
                default ->{
                    stack.add( Integer.parseInt(i));
                }
            }
        }
        return stack.pop();
    }
}