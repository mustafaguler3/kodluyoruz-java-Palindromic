public class main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
    static boolean isPalindrome(String str){
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse += ch;
        }

        if(str.equals(reverse)){
            return true;
        }else{
            return false;
        }


    }
}
