// Product of 2 numbers using recursion 
class Solution{
    public static void main(String[] args) {
        // Enter Your Code Here
        int x =  3, y = 23;
        int result = product(x, y);
        System.out.print("Product : " + result);
    }
    static int product(int x , int y){
        if( y == 0 )
            return 0;
        if(x < y)
            return product(y , x);
        return x + product(x, y - 1);
    }
}