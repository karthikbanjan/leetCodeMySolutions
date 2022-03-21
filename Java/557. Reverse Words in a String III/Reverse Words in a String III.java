//https://leetcode.com/problems/reverse-words-in-a-string-iii/

import java.util.*;

class Solution {
    
    public String reverseWord(char[] c) {
        for (int i = 0, j = c.length - 1; i < j; i++, j--) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
        }
        
        return new String(c);
    }
    
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sBuilder = new StringBuilder();
        
        while (st.hasMoreElements()) {
            char[] c = st.nextToken().toCharArray();
            sBuilder.append(reverseWord(c)).append(" ");
        }
        
        return new String(sBuilder).trim();
    }
}
