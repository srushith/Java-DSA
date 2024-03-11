import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digits = 0;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        System.out.println("The number of digits: " + digits);
        temp = n;
        while (temp > 0) {
            int last = temp % 10;
            sum = (int) (sum + Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a Armstrong number");
        }
    }
}
