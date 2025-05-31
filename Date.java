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

class Student_course {
    int sem;
    String[] courseName = new String[3];
    int[] Marks = new int[3];

    Student_course(int sem, String[] courseName, int[] Marks) {
        this.sem = sem;
        this.courseName = courseName;
        this.Marks = Marks;
    }

    void show2() {
        System.out.println("Semester: " + sem);
        for (int i = 0; i < courseName.length; i++) {
            System.out.println("Course Name: " + courseName[i] + "\tMarks: " + Marks[i]);
        }
    }
    
}

public class Date {
    public static void main(String[] args) {
        Student s = new Student("rohit", 21);
        s.show1();
        Student_course sc = new Student_course(5, new String[]{"Java", "Python", "C++"}, new int[]{90, 85, 88});
        sc.show2();
    }
}
