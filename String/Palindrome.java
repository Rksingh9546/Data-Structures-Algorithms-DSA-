public class Palindrome {
    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length();i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){//O(n) b
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str= "Haluman";
        System.out.println(ispalindrome(str));
    }
}
