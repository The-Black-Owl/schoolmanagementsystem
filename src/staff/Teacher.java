package staff;

import course.Course;
import school.School;

import java.util.List;
import java.util.Objects;

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

    public String teacherSummary() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                "\n, courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherID == teacher.teacherID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(teacherID);
    }
}
