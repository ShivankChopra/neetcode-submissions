class Solution {
    /**
     * @param {string} s
     * @param {number} k
     * @return {number}
     */
    characterReplacement(s, k) {
        let maxFreq = 0, map = {};
        let l = 0, max = 0;

        for (let r = 0; r < s.length; r++) {
            let rchar = s.charAt(r);
            map[rchar] = (map[rchar] || 0) + 1;

            maxFreq = Math.max(maxFreq, map[rchar]);

            while (r - l + 1 - maxFreq > k) {
                map[s.charAt(l)]--;
                l++;
            }

            max = Math.max(r - l + 1, max);
        }

        return max;
    }
}
