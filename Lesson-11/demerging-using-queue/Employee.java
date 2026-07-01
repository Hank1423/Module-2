public class Employee {
    private String name;
    private String gender;
    private String birthDate;

    public Employee(String name, String gender, String birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getGender() { return gender; }
    public String getName() { return name; }
    public String getBirthDate() { return birthDate; }

    @Override
    public String toString() {
        return String.format("Họ tên: %-15s | Giới tính: %-5s | Ngày sinh: %s", name, gender, birthDate);
    }
}