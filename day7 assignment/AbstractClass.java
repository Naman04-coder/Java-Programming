abstract class Student {
    abstract void calculateResult(int s1, int s2, int s3, int s4, int s5);
}

class Student1 extends Student {
    @Override
    void calculateResult(int s1, int s2, int s3, int s4, int s5) {
        int totalMarks = s1 + s2 + s3 + s4 + s5;
        System.out.println("Student1 Total Marks: " + totalMarks);
    }
}

class Student2 extends Student {
    @Override
    void calculateResult(int s1, int s2, int s3, int s4, int s5) {
        int totalMarks = s1 + s2 + s3 + s4 + s5;
        System.out.println("Student2 Total Marks: " + totalMarks);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Student stu1 = new Student1();
        Student stu2 = new Student2();
        
        stu1.calculateResult(85, 90, 78, 88, 92);
        stu2.calculateResult(75, 80, 68, 85, 77);
    }
}