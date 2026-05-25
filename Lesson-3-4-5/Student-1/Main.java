import src.Student;
public class Main {
    public static void main(String[] args){
        Student student1 = new Student();
        System.out.println("Học sinh 1: " + student1.getName() + " - Lớp: " + student1.getClasses());

        Student student2 = new Student("Jimmy", "CO1");
        System.out.println("Học sinh 2: " + student2.getName() + " - Lớp: " + student2.getClasses());
    }
}
