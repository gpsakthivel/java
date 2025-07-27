package questionLevel.basic;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reserved = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reserved));
    }
}
