public class StringRev {
    public static void main(String[] args) {
        String n = "Hero";
        String p = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            p = p + n.charAt(i);
        }
        System.out.println(p);
    }
}
