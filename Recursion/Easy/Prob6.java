class Solution{
    public static void main(String[] args) {
        String str = "geeS";
        int len = strLen(str);
        System.out.print(len);
    }

    static int strLen(String str){
        if( str.equals("") )
            return 0;
        
        return 1 + strLen(str.substring(1));
    } 
}