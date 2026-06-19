public class Main {
    public static void main(String[] args){
        String[] testPhoneNumbers = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(84)-(097848964)",
                "(123)-(0123456789)"
        };

        System.out.println("Phone Check");
        for (String phone : testPhoneNumbers) {
            boolean isValid = PhoneValidator.validate(phone);
            System.out.printf("%-20s : %s\n", phone, (isValid ? "Valid" : "Invalid"));
        }
    }
}
