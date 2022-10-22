package myJavaStart.statyczne;

public class University {
    public static void main(String[] args) {

        Student student1 = new Student("jan","nowak","17672626");
        Student student2 = new Student("jan","nowak","17672626");
        Student student3 = new Student();
        System.out.println(Student.getLiczbaStudentow());
    }
}
