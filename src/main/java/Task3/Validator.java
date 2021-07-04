package Task3;

public class Validator {
    public static final String NAME_REGEX = "[A-Za-z]+";
    public static final String LOGIN_REGEX = "[A-Za-z0-9_]+";

    public static boolean isValid(String string, String regex) {
        return string.matches(regex);
    }
}
