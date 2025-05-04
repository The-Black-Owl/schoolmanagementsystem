package student;

import course.Course;
import reference.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentManagement {
    public HashMap<Integer,Student> students=new HashMap<>();
    public HashMap<Integer, List<Student>> parentStudentLink=new HashMap<>();
    public HashMap<Course, List<Student>> courseStudentLink = new HashMap<>();
    public HashMap<Student,List<Course>> studentCourseLink=new HashMap<>();
    //register new student
    public Student registerStudent(int studentID, String studentNumber, String firstname, String lastname, Address address){
        Student newStudent=new Student(studentID,studentNumber,firstname,lastname,address);
        students.put(newStudent.getStudentID(), newStudent);
        return  newStudent;
    }
    //delete student
    public boolean removeStudent(Student student){
        return students.remove(student.getStudentID(),student);
    }
    //assign parent to student
    public void assignStudentToParent(int parentID, Student student){
        if(!parentStudentLink.containsKey(parentID)){
            parentStudentLink.put(parentID,new ArrayList<>());
        }
        parentStudentLink.get(parentID).add(student);
    }
    //view student profile
    public String studentDetails(Student student){
        return student.studentSummary();
    }
    //Assign student to courses
    public void enrollStudentToCourse(Student student, Course course){
        if(!studentCourseLink.containsKey(student)){
            studentCourseLink.put(student,new ArrayList<>());
        }

        if(!courseStudentLink.containsKey(course)){
            courseStudentLink.put(course,new ArrayList<>());
        }

        studentCourseLink.get(student).add(course);
        courseStudentLink.get(course).add(student);
    }
    //remove student from course
    public void removeStudentFromEnrolledCourse(Student student,Course course){
        //remove the student
        List<Student> studentsInACourse=courseStudentLink.get(course);
        if(studentsInACourse != null){
            studentsInACourse.remove(student);
        }
        // remove the course
        List<Course> coursesForAStudent=studentCourseLink.get(student);
        if(coursesForAStudent!=null){
            coursesForAStudent.remove(course);
        }
    }
    //getting  students and courses
    public List<Student> getStudentsForCourse(Course course){
        return courseStudentLink.get(course);
    }
    public List<Course> getCoursesForStudent(Student student){
        return studentCourseLink.get(student);
    }
    //update student details
    public Student updateStudentDetail(int id,String firstname, String lastname, Address address){
        Student student=students.get(id);
        if(firstname!=null){
            student.setFirstname(firstname);
        }
        if(lastname!=null){
            student.setLastname(lastname);
        }
        if(address!=null){
            student.setAddress(address);
        }
        return student;
    }

    //view student details
    public String getStudent(int id){
        return students.get(id).studentSummary();
    }
}