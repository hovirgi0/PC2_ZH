public class Scheduler extends Timetable{
    public void setTimestamp(String courseName, double timestamp) { //metódusával lehessen módosítani a Recipes objektumban tárolt elemeket
        boolean contains = false;
        for (int i = 0; i < super.courseList.size(); i++) {
            if (super.courseList.get(i).gettimestamp() == (timestamp)) {
                contains = true;
            }
        }
        if (!contains) {
            super.courseList.add(new Course(courseName, timestamp));
        }
    }
}
