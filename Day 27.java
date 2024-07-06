class User {
    private String name;
    private String email;
    private int age;

    // Constructor
    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Instructor extends User {
    private String qualification;
    private String[] coursesTaught;
    private double salary;

    // Constructor
    public Instructor(String name, String email, int age, String qualification, String[] coursesTaught, double salary) {
        super(name, email, age);
        this.qualification = qualification;
        this.coursesTaught = coursesTaught;
        this.salary = salary;
    }

    // Getter methods
    public String getQualification() {
        return qualification;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Student extends User {
    private String[] registeredCourses;
    private String grade;
    private int joiningYear;

    // Constructor
    public Student(String name, String email, int age, String[] registeredCourses, String grade, int joiningYear) {
        super(name, email, age);
        this.registeredCourses = registeredCourses;
        this.grade = grade;
        this.joiningYear = joiningYear;
    }

    // Getter methods
    public String[] getRegisteredCourses() {
        return registeredCourses;
    }

    public String getGrade() {
        return grade;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    // Setter methods
    public void setRegisteredCourses(String[] registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }
}
class Main {
    public static void main(String[] args) {
        // Creating an Instructor object
        String[] coursesTaught = {"Math", "Physics"};
        Instructor instructor = new Instructor("John Doe", "john.doe@example.com", 45, "PhD in Physics", coursesTaught, 75000.0);

        // Creating a Student object
        String[] registeredCourses = {"Math", "Biology", "Chemistry"};
        Student student = new Student("Jane Smith", "jane.smith@example.com", 20, registeredCourses, "A", 2022);

        // Printing Instructor details
        System.out.println("Instructor Details:");
        System.out.println("Name: " + instructor.getName());
        System.out.println("Email: " + instructor.getEmail());
        System.out.println("Age: " + instructor.getAge());
        System.out.println("Qualification: " + instructor.getQualification());
        System.out.println("Courses Taught: " + String.join(", ", instructor.getCoursesTaught()));
        System.out.println("Salary: " + instructor.getSalary());

        // Printing Student details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Age: " + student.getAge());
        System.out.println("Registered Courses: " + String.join(", ", student.getRegisteredCourses()));
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Joining Year: " + student.getJoiningYear());
    }
}

