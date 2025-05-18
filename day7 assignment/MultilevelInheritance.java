class Person {
    String name;

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String studentId;

    void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent extends Student {
    String degree;

    void display() {
        super.display();
        System.out.println("Degree: " + degree);
    }
}

class PostGraduateStudent extends GraduateStudent {
    String specialization;

    void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        PostGraduateStudent pg = new PostGraduateStudent();

        pg.name = "Alice";
        pg.studentId = "PG123";
        pg.degree = "MCA";
        pg.specialization = "AI & ML";

        System.out.println("----- Student Details -----");
        pg.display();
    }
}
