import src.NameValidator;

public class Main {
    public static void main(String[] args) {
        String[] testClassNames = {
                "C0223G",
                "A0323K",
                "P1234I",
                "M0318G",
                "P0323A",
                "C123G",
                "A12345K",
                "C0223g"
        };

        System.out.println("Class check");
        for (String className : testClassNames) {
            boolean isValid = NameValidator.validate(className);
            System.out.printf("Tên lớp: %-8s -> %s\n",
                    className, (isValid ? "Valid" : "Invalid"));
        }
    }
}
