import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b + " ");

        }
    }
}
