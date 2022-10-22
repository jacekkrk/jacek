package myJavaStart.objecty;

public class School {
    public static void main(String[] args) {

        Student student1 = new  Student(25, "Jan Kowalski");
       // Student student2 = null;
        Student student2 = new  Student(25, "Jan Kowalsk");

        System.out.println("student1 == student2");

        System.out.println(student1 == student2);
        System.out.println("Sprawdzenie equals");
        System.out.println(student1.equals(student2));


//        System.out.println(student1 instanceof Student);
//        System.out.println(student1 instanceof Person);
    }
}
