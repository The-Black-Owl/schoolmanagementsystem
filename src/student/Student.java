package student;

import course.Grade;
import reference.Address;
import staff.Teacher;

import java.util.Objects;

public class Student {
    private int studentID;
    private String studentNumber;
    private String firstname;
    private String lastname;
    private Address address;
//    private Grade grade;
//    private Teacher formTeacher;

    public Student(int studentID,
                   String studentNumber, String firstname,String lastname, Address address) {
        this.studentID = studentID;
        this.studentNumber = studentNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
//        this.grade = grade;
//        this.formTeacher = formTeacher;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstname() {return firstname;    }

    public void setFirstname(String firstname) { this.firstname = firstname;    }

    public String getLastname() {
        return lastname;
    }

    public void setLaststname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String studentSummary() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentID);
    }
}
