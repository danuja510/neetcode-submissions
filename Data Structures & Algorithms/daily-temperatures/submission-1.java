class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> pending = new Stack();
        int[] output = new int[temperatures.length];
        for(int i=0; i< temperatures.length; i++){
            if (i == temperatures.length -1){
                output[i] =0;
            }
            while(!pending.isEmpty() && temperatures[pending.peek()]< temperatures[i]){
                output[pending.peek()] = i-pending.peek();
                pending.pop();
            }
            pending.push(i);
                
        }
        return output;
    }
}
