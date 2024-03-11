import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int s = 0;
        int e = n.length() - 1;
        boolean isPalindrome = true;
        while (s < e) {
            if (n.charAt(s) != n.charAt(e)) {
                isPalindrome = false;
                break;
            }
            s++;
            e--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}
