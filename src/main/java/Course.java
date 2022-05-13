public class Course {
    private String courseName;
    private double timestamp;

    public Course(String courseName, double timestamp) {
        this.courseName = courseName;
        this.timestamp = timestamp;
    }

    public Course(double timestamp) {
    }

    public String getcourseName() {
        return courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public double gettimestamp() {
        return timestamp;
    }

    public void settimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "courseName='" + courseName + '\'' +
                "timestamp='" + timestamp + '\'' +
                '}';
    }
}
