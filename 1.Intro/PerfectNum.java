public class PerfectNum {
    public static void main(String[] args) {
        int n = 28;
        int sum = 1;
        if (n == 1) {
            System.out.println("Not a perfect square");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
        }
        if (sum == n) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect square");
        }
    }
}
