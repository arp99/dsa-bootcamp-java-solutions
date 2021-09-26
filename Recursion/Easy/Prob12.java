class Solution{
    public static void main(String[] args) {
        // Enter Your Code Here
        int sum = sumOfNaturalNums(8);
        System.out.print(sum);
    }
    static int sumOfNaturalNums(int n){
        if(n <= 1)
            return n;
        return n + sumOfNaturalNums( n - 1 );
    }
}