package library;

import java.util.StringJoiner;

public class TestJoiner {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 4;
        int n3 = 7;
        StringJoiner joiner = new StringJoiner(" ");
        if(n2 - n1 == n3 - n2) {
            int i = n2 - n1;
            for (int j = 1; j < 4; j++) {
                joiner.add(Integer.toString(n3 += i));
            }
            System.out.println(joiner);
        } else
            System.out.println("Нет");
    }
}
