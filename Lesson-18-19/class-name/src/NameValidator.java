package src;

import java.util.regex.Pattern;

public class NameValidator {
    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public static boolean validate(String className) {
        return Pattern.matches(CLASS_NAME_REGEX, className);
    }
}
