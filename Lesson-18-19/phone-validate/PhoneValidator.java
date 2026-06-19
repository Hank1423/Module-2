import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    private static final Pattern pattern = Pattern.compile(PHONE_REGEX);

    public static boolean validate(String phoneNumber){
        if (phoneNumber == null){
            return false;
        }
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
