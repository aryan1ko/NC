class Solution {
    public int characterReplacement(String s, int k) {
        //find most frequent character
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(freqMap.containsKey(c)) {
                int freq = freqMap.get(c);
                freqMap.put(c, freq++);
            }
            else {
                freqMap.put(c, 1);
            }
        }

        char mostFreqChar = ' ';
        int max = 0;
        for(char key : freqMap.keySet()) {
            if(freqMap.get(key) > max) {
                mostFreqChar = key;
                max = freqMap.get(key);
            }
        }

        Set<Character> set = new HashSet<>();

        int left = 0;
        int rep = 0;
        for(int right = 0; right < s.length(); right++) {
            if(s.charAt(right) != mostFreqChar) {
                // right++;
                rep++;
                set.add(s.charAt(right));
                max = Math.max(right - left, max);
            } else {
                // right++;
                set.add(s.charAt(right));
                max++;
            }
            while(rep > k) {
                if(s.charAt(left) != mostFreqChar) {
                    set.remove(s.charAt(left));
                    rep--;
                    left++;
                }
                else {
                    left++;
                }
            }
        }

        return max;
    }
}
