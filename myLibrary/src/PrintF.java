public class PrintF {
    public static void main(String[] args) {
        int sumPromo = 0;
        double sum = 0;
        int num = 4;
        for (int i = 1; i <= num; i++) {
            sum += Math.sqrt(2 * i - 1);
        }
        System.out.printf("%.2f", sum);
    }
}

