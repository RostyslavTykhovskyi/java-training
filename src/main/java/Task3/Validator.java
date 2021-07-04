package Task3;

public class Validator {
    public static final String NAME_REGEX = "[A-Za-z]+";
    public static final String LOGIN_REGEX = "[A-Za-z0-9_]+";

    /**
     * Created by Rostyslav Tykhovskyi on 04.07.2021
     *
     * @param string string to be validated
     * @param regex used to validate the string
     * @return true if string matches regex, else false
     */
    public static boolean isValid(String string, String regex) {
        return string.matches(regex);
    }
}
