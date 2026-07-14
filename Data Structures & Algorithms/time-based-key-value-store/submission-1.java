class TimeMap {
    Map<String, ArrayList<Pair>> timeMap;

    public TimeMap() {
        timeMap = new HashMap();
    }

    public void set(String key, String value, int timestamp) {
        if (timeMap.containsKey(key))
            timeMap.get(key).add(new Pair(timestamp, value));
        else {
            var tempList = new ArrayList();
            tempList.add(new Pair(timestamp, value));
            timeMap.put(key, tempList);
        }
    }

    public String get(String key, int timestamp) {
        ArrayList<Pair> arr = timeMap.get(key);
        if (arr == null)
            return "";
        int l = 0, r = arr.size() - 1, k = 0;
        while (l <= r) {
            k = (l + r) / 2;
            if (arr.get(k).key == timestamp
                || (arr.get(k).key < timestamp && k + 1 <= arr.size() - 1
                    && arr.get(k + 1).key > timestamp)) {
                return arr.get(k).value;
            }
            if (arr.get(k).key > timestamp)
                r = k - 1;
            else
                l = k + 1;
        }
        if (arr.get(k).key <= timestamp)
            return arr.get(k).value;
        else
            return "";
    }
}

class Pair {
    public int key;
    public String value;

    public Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
