package myJavaStart.objecty;

import java.util.Objects;

public class Student extends Person {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null) return false;
//        if (this.getClass() != obj.getClass()) {
//
//            return false;
//        }
//        if (age != ((Student) obj).age)
//        return false;
//        if(name == null) {
//            if (((Student) obj).name != null) {
//                return false;
//            }
//        } else if (name.equals(((Student) obj).name) ){
//            return  false;   //bo string jest obiektem
//
//        }
//        return false;
//    }

}
