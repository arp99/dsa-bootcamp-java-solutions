// First upper case letter in a string 
class Solution{

    static char firstUpperLetter(String str, int first){

        if( str.charAt(first) == '\0' ){
            return 0;
        }
        
        if(Character.isUpperCase(str.charAt(first)))
            return str.charAt(first);
        
        return firstUpperLetter(str, first + 1);
    } 
}