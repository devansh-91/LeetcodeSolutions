import java.io.*;
import java.util.*;

class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.length() == 0)
            return 0;

        int l = s.length();
        long n = 0;
        int sign = 1;

        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);

            if (i == 0) {
                if (ch == '-') {
                    sign = -1;
                    continue;
                }
                if (ch == '+') {
                    continue;
                }
            }

            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                n = n * 10 + digit;

                if (n * sign >= Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (n * sign <= Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            } else {
                break;
            }
        }

        return (int) (n * sign);
    }
}