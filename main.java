import java.util.ArrayList;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("=== Student Management System ===");

        ArrayList<Student> recordSystem = new ArrayList<>();

        recordSystem.add(new Student("Rahul Kumar", 101));
        recordSystem.add(new Student("Shainaj Pathan", 102));
        recordSystem.add(new Student("Amit Sharma", 103));

        System.out.println("\nDisplaying All Student Records:");
        for (Student s : recordSystem) {
            System.out.println(s);
        }

        System.out.println("\nSearching for Student with ID 102:");
        for (Student s : recordSystem) {
            if (s.getId() == 102) {
                System.out.println("Found Record: " + s.getName());
            }
        }
    }
}
