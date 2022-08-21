public class Calc {
    public static String calculation(String wrd1, String wrd2, String operation) throws Exception {
        int num = 0;
        String result = new String();
        if (wrd1.length() > 10) {
            throw new Exception("запрещено вводить строки длиной более 10 символов");
        }
        if (wrd2.length() > 10) {
            throw new Exception("запрещено вводить строки длиной более 10 символов");
        }
        switch (operation) {
            case "+":
                result = wrd1 + wrd2;
                break;
            case "-":
                result = wrd1.replaceAll(wrd2, "");
                break;
            case "*":
                num = Integer.parseInt(wrd2);
                if (num < 1 || num > 10) {
                    throw new Exception("Необходимо использовать числа от 1 до 10");
                }
                for (int i = 0; i < num; i++) {
                    result += wrd1;
                }
                break;
            case "/":
                num = Integer.parseInt(wrd2);
                if (num < 1 || num > 10) {
                    throw new Exception("Необходимо использовать числа от 1 до 10   ");
                }
                int stringLength = wrd1.length() / num;
                result = wrd1.substring(0, stringLength);
                break;
            default:
                throw new Exception("Неверная операция");
        }
        return result;
    }
}
