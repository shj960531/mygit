public class Cotae19 {
    public static void main(String[] args) {
        int n = 9;
        String[] count = new String[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                count[i] = "수";
            } else {
                count[i] = "박";
            }
            System.out.print(count[i]);
        }
    }
}
