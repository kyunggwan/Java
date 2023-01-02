package Inheritance.overriding;

public class Student extends Person {

        private String major;
    public Student(String name, int age, String major) {
        super.setName(name);
        super.setAge(age);
        this.major = major;
        System.out.println("Student 생성자 실행");
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return this.getName() + ":" + this.getAge() + ":" + major;
    }
}
