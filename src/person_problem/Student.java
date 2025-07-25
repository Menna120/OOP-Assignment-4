package person_problem;

public class Student extends Person {
    private int numCourses;
    private final String[] courses;
    private final int[] grades;
    private static final int MAX_COURSES = 10;

    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
        this.grades = new int[MAX_COURSES];
    }

    public void addCourseWithGrade(String course, int grade) {
        if (numCourses < MAX_COURSES) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }
    }

    public void printCoursesAndGrades() {
        System.out.println("Courses and Grades for " + getName() + ":");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / numCourses;
    }

    @Override
    public String toString() {
        return "person_problem.Student: " + super.toString();
    }
}