class Solution{
    public static void main(String[] args) {
        System.out.println(reverseNum(1824));
    }
    public static int helper(int num, int res) {
        if( num < 10 )
            return res*10 + num;
        
        return helper( num/10, res*10 + ( num % 10 ));
    }
    public static int reverseNum(int num) {
        return helper(num, 0);
    }
}