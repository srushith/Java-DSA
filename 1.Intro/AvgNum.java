public class AvgNum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        double avg = (double) sum / n;
        System.out.println(avg);
    }
}
