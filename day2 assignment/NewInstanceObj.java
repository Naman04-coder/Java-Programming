//write a program to implement multiple objects of a class by using instance method of a class.
public class NewInstanceObj {
    public static void main(String[] args) {
        try {
            // Creating an object of the outer class NewInstanceObj
            NewInstanceObj outerClass = new NewInstanceObj();
            Class<?> c = Class.forName("NewInstanceObj$Student");

            // Creating an instance of Student using reflection
            Student s = (Student) c.getDeclaredConstructor(NewInstanceObj.class).newInstance(outerClass);

            // Setting values using the constructor
            s.name = "Kartik";
            s.roll_no = 51;

            System.out.println("Student Details:");
            s.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class Student {
        String name;
        int roll_no;

        public Student() {
            this.name = "Default Name";
            this.roll_no = 0;
        }
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + roll_no);
        }
    }
}
