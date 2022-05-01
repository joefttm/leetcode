package array;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public static int solve(String s) {
        Map<Character, Integer> mmap = new HashMap<>();
        int ans = 0, lastIndex = -1;
        for(int i=0;i<s.length();++i){
            char c = s.charAt(i);
            if (mmap.getOrDefault(c, -1) > lastIndex) {
                lastIndex = mmap.getOrDefault(c, -1);
            }
            ans = Math.max(ans, i - lastIndex);
            mmap.put(c, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve("abcdeafbdgcbb"));
    }
}
