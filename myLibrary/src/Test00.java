import java.util.StringJoiner;

public class Test00 {
    public static void main(String[] args) {

        int months = 2;
        int money = 10000;
        int count = 0;

        int[] num = {21, 23, 27, 19, 22};
        int min = num[0];
        int number = 0;
        for (int i = 1; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
            for (int j = 0; j < num.length; j++) {
                if (min == num[j]) {
                    number = j;
                }
            }
        System.out.println("Время: " + min + ", " + "номер: " + number);
    }
}
