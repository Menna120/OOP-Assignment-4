package person_problem;

public class Teacher extends Person {
    private int numCourses;
    private final String[] courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
    }

    public boolean addCourse(String course) {
        if (numCourses >= MAX_COURSES) {
            return false;
        }
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equalsIgnoreCase(course)) {
                return false;
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        int indexToRemove = -1;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equalsIgnoreCase(course)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            return false;
        }

        for (int i = indexToRemove; i < numCourses - 1; i++) {
            courses[i] = courses[i + 1];
        }
        courses[numCourses - 1] = null;
        numCourses--;
        return true;
    }

    @Override
    public String toString() {
        return "person_problem.Teacher: " + super.toString();
    }
}
