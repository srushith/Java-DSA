public class PythagoreanTriplet {
    public static void main(String[] args) {
        int [] arr = {4,3,1,6,7};
        if(isPythagorean(arr,arr.length)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    static boolean isPythagorean(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int x = arr[i] * arr[i], y = arr[j] + arr[j], z = arr[k] + arr[k];
                    if (x == y + z || y == z + x || z == y + x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
