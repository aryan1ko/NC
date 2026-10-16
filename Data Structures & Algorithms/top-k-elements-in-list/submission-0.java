class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        ArrayList<Integer>[] freqArr = new ArrayList[nums.length + 1];


        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];


        for(int num : nums) {
            if(map.containsKey(num)) {
                int idx = map.get(num);
                idx++;
                map.put(num, idx);
                //remove from slot in array
                freqArr[idx - 1].remove(Integer.valueOf(num));
                if(freqArr[idx] == null) {
                    freqArr[idx] = new ArrayList<>();
                }
                //add to next slot
                freqArr[idx].add(Integer.valueOf(num));
            }
            else {
                map.put(num, 1);
                if(freqArr[1] == null) {
                    freqArr[1] = new ArrayList<>();
                }
                //put in first slot
                freqArr[1].add(Integer.valueOf(num));
            }
        }

        int tempIdx = nums.length;
        int counter = 0;
        while(counter < k) {
            if(freqArr[tempIdx] != null && !freqArr[tempIdx].isEmpty()) {
                int num = freqArr[tempIdx].remove(0);
                result[counter] = num;
                counter++;
            }
            else {
                tempIdx--;
            }
        }

        
        return result;
    }
}
