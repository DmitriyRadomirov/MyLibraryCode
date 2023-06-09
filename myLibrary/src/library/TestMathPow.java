package library;

import java.util.StringJoiner;

public class TestMathPow {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 100; i++) {
            if ((i / 10 + i % 10) * 2  == (i / 10) * (i % 10)) {
                joiner.add(i + "");
                count++;
                sum += i;
            }
        }
        System.out.println("Числа: " + joiner + ", " + "Количество: "  + count + ", " + "Сумма: " + sum);
    }
}
