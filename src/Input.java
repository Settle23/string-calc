import java.util.Scanner;

public class Input {
    private static String extractValue(String quotedValue) {
        return quotedValue.replaceAll("\"", "");
    }

    public static String[] read() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] separator = input.split(" ");
        if (separator.length > 3) {
            throw new Exception("Операции выполняются только с двумя аргументами");
        }
        boolean isInt = IntChecker.itsInt(separator[0]);
        if (isInt) {
            throw new Exception("Начинать с чисел запрещено");
        }
        boolean quote = Quotes.isValid(separator);
        if (quote == false) {
            throw new Exception("Строки должны быть в кавычках");
        }
        separator[0] = Input.extractValue(separator[0]);
        separator[2] = Input.extractValue(separator[2]);
        return separator;
    }
}
