class Solution {
    public String reorganizeString(String s) {
        Map <Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            if (freq.get(c) > (s.length() + 1)/2){
                return "";
            }
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a,b) -> freq.get(b) - freq.get(a)
        );
        maxHeap.addAll(freq.keySet());

        StringBuilder result = new StringBuilder();

        while(maxHeap.size() > 1){
            char first = maxHeap.poll();
            char second = maxHeap.poll();
            result.append(first);
            result.append(second);

            freq.put(first, freq.get(first)-1);
            freq.put(second, freq.get(second)-1);

            if (freq.get(first) > 0) {
                maxHeap.offer(first);
            }
            if (freq.get(second) > 0){
                maxHeap.offer(second);
            }
        }
    if (!maxHeap.isEmpty()){
        result.append(maxHeap.poll());
    }

    return result.toString();

    }
}