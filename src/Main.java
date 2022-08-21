import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение типа: \"а\" + \"b\", \"a\" - \"b\", \"a\" * x, \"a\" / x");
        String[] value = Input.read();
        String operation = value[1];
        String result = Calc.calculation(value[0], value[2], operation);
        int resultLength = result.length();
        if (resultLength > 40) {
            System.out.println("\"" + result.substring(0, 40) + "..." + "\"");
        } else if (resultLength <= 40) {
            System.out.println("\"" + result + "\"");
        }
    }
}
