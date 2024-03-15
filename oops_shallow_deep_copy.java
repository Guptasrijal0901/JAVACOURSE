public class oops_shallow_deep_copy {
    public static void main(String[] args) {
        // Creating an object of Student
        Student originalStudent = new Student("Srijal", 23, 180);
        // Shallow Copy
        Student shallowCopyStudent = originalStudent.shallowCopy();

        // Deep Copy
        Student deepCopyStudent = originalStudent.deepCopy();

        // Modifying originalStudent to demonstrate shallow copy
        // originalStudent.setName("Alice");

        // Displaying details of all students
        System.out.println("Original Student: " + originalStudent);
        System.out.println("Shallow Copy Student: " + shallowCopyStudent);
        System.out.println("Deep Copy Student: " + deepCopyStudent);
    }
}
class Student {
    private String name ;
    private int age ;
    private int roll ;

    // Constructor
    Student(String name, int age, int roll){
    this.name = name;
    this.age = age ;
    this.roll = roll;
    }
    // Getter and Setter methods
       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    // Shallow Copy method
    public Student shallowCopy() {
        return new Student(this.name, this.age, this.roll);
    }

    // Deep Copy method
    public Student deepCopy() {
        // Create a new instance of Student and copy values
        return new Student(this.name, this.age, this.roll);
    }
    // Override toString method for better representation
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll=" + roll +
                '}';
    }
}
