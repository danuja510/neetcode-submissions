class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Set<Double> temp = new HashSet();
        for (int i=0; i< position.length; i++){
            double time = (target-position[i])/ speed[i];
            temp.add(time);
        }
        return temp.size();
    }
}
