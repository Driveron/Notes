
public class Student implements Person {
    // instance variables
    String id;
    String name;
    int age;

    // Constructors
    public Student (String i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    protected int studyHours() { return age / 2; }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public boolean equals(Person other) {
        if (other instanceof Student) {
            return false;
        }
        Student s = (Student) other;
        return id.equals(s.id);
    }

    public String toString() {
        return "Student(ID: " + id + ", Name: " + name + ", Age: " + age + ")";
    }
}