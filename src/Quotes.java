public class Quotes {
    public static boolean inQuotes(String quotes) {
        return quotes.startsWith("\"") && quotes.endsWith("\"");
    }

    public static boolean isValid(String[] values) {
        String opr = values[1];
        switch (opr) {
            case "*":
            case "/":
                return Quotes.inQuotes(values[0]) && IntChecker.itsInt(values[2]);
        }
        return Quotes.inQuotes(values[0]) && Quotes.inQuotes(values[2]);
    }
}
