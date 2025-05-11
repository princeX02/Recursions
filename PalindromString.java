public class PalindromString {
    public static boolean isPalindrom(int i,String str){
        int n=str.length();

        if(i>=n/2)
            return true;
        
        if(str.charAt(i)!=str.charAt(n-i-1))
            return false;
        return isPalindrom(i+1, str);    
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(0,"MADAM"));
    }
}
