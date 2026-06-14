class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> temp = new HashMap();
        for (int i = 0; i < position.length; i++) {
            double time = (double) (target - position[i]) / (double) speed[i];
            temp.put(position[i], time);
        }
        Arrays.sort(position);
        Stack<Double> fleets = new Stack();
        for (int i = position.length - 1; i >= 0; i--) {
            if (i == position.length - 1) {
                fleets.push(temp.get(position[i]));
                continue;
            }
            if(fleets.peek()< temp.get(position[i]))
                fleets.push(temp.get(position[i]));
        }
        return fleets.size();
    }
}
