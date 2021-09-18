class Solution {
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
    static void helper(char[] c, int start, int end){
        if( start > end )
                return;
        char temp = c[start];
        c[start] = c[end];
        c[end] = temp;
        
        helper(c, start + 1, end - 1);
    }
}