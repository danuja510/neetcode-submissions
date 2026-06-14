class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> temp = new HashMap();
        for (int i = 0; i < position.length; i++) {
            double time = (double) (target - position[i]) / (double) speed[i];
            temp.put(position[i], time);
        }
        int fleets = 0;
        Arrays.sort(position);
        for (int i = 0; i < position.length; i++) {
            if (i == 0) {
                fleets++;
                continue;
            }
            if (temp.get(position[i - 1]) > temp.get(position[i])) {
                fleets++;
            } else if (temp.get(position[i - 1]) < temp.get(position[i])) {
                temp.put(position[i - 1], temp.get(position[i]));
            }
        }
        return fleets;
    }
}
