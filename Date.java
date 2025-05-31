class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show1(){
        System.out.println("Student Name: " + name + "\nAge: " + age);
    }
}
public class Date {
    public static void main(String[] args) {
        Student s = new Student("rohit", 21);
        s.show1();
    }
}
