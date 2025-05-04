package staff;

import course.Course;
import school.School;

import java.util.List;

public class Teacher extends Staff {
    private int teacherID;
    private List<Course> courses;

    public Teacher(int staffID, String staffName, String staffSurname, String staffNumber, String email,
                   String phone, School school, int teacherID, List<Course> courses) {
        super(staffID, staffName, staffSurname, staffNumber, email, phone, school);
        this.teacherID = teacherID;
        this.courses = courses;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
