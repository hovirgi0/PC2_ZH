import java.util.ArrayList;

public class Timetable {
    public static void main(String[] args) {
        //
        Course math = new Course("\"Math\"", 10.30);
        math.settimestamp(10.30);

        System.out.println(math.getcourseName()); //kurzus neve
        System.out.println(math.gettimestamp()); //kurzus időpontja

        System.out.println(Timetable.newCourse());
        System.out.println(Timetable.removeCourse());
        System.out.println(Timetable.getCourses());

       //Scheduler leszármazott osztály
        Scheduler scheduler = new Scheduler();
        scheduler.setTimestamp("\"Math\"", 15.30);
        System.out.println(Scheduler.newCourse());
    }
    protected static ArrayList<Course> courseList = new ArrayList<>();

    public static String newCourse() { //új kurzus hozzáadása
        StringBuilder builder = new StringBuilder();
        for (Course course : courseList) {
            builder.append(course.getcourseName()).append("\r\n");
        }
        return builder.toString();
    }

    public static String removeCourse() { //adott elem törlése
        String removedStr = new String();
        for (Course course : courseList) {
            removedStr = String.valueOf(courseList.remove(getCourses()));
        }
        return removedStr;
    }

    public static String getCourses() { //egy String-ben visszaadja az aktuálisan tárolt kurzusok adatait
        String Items = new String();
        for (Course course : courseList) {
            Items += course.gettimestamp();
        }
        return Items;
    }
}
