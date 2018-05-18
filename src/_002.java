public class _002 {
    public static void main(String[] args) {
        String s = "thisisme";
        Solution2 solution = new Solution2();
        int i = solution.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int length = s.length();
        if (length == 1) {
            return 1;
        }

        int longest = 0;
        int len = 0;
        String tmp;

        for (int i = 0; i < length; ++i) {
            if (longest >= length - i) {  // (1)
                break;                    // no need to go on
            }

            len = 0;
            for (int j = i + 1; j < length; ++j) {
                ++len;

                tmp = s.substring(i, j);
                int index = tmp.indexOf(s.charAt(j));
                if (index != -1) {
                    i += index;
                    // compare following items
                    int k = j;  // in order to make it clear(works well without k)
                    while ((++k < length) && (s.charAt(i + 1) == s.charAt(k))) {
                        ++i;
                    }

                    if (longest < len) {
                        longest = len;
                    }

                    break;
                }

                if (j == length - 1) {
                    longest = len + 1;  // this is true because of (1)
                    break;              // to make it clear, do like this:
                    // if (longest < len + 1) longest = len + 1;
                }
            }
        }

        return longest;
    }
}
