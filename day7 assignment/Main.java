class Person implements Cloneable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Jyoti", 25);
        Person p2 = (Person) p1.clone();

        p1.display();  
        p2.display(); 

        System.out.println("p1 hash: " + p1.hashCode());
        System.out.println("p2 hash: " + p2.hashCode());

        p2.name = "Komal";

        p1.display();
        p2.display();
    }
}