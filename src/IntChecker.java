public class IntChecker {
    public static boolean itsInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
