class Palindrome{
    boolean check;
    String word;

    boolean isPalindrome(String str){
        this.word = str.toLowerCase();
        int l = word.length();

        for (int i=0; i<(l/2); i++){
            if ((word.charAt(i)) != (word.charAt(l-(i+1)))){
                check = false;
                break;
            }
            else{
                check = true;
            }
        }

        return check;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Palindrome pd = new Palindrome();
        System.out.println(pd.isPalindrome("Hello"));
        System.out.println(pd.isPalindrome("Radar"));
        System.out.println(pd.isPalindrome("Racecar"));
    }
}
