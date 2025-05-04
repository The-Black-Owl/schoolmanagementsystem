package staff;

import school.School;

import java.util.Objects;

public class Staff {
    private int staffID;
    private String staffName;
    private String staffSurname;
    private String staffNumber;
    private String email;
    private String phone;
    private School school;

    public Staff(int staffID, String staffName,
                 String staffSurname, String staffNumber, String email, String phone, School school) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffSurname = staffSurname;
        this.staffNumber = staffNumber;
        this.email = email;
        this.phone = phone;
        this.school = school;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffSurname() {
        return staffSurname;
    }

    public void setStaffSurname(String staffSurname) {
        this.staffSurname = staffSurname;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String staffSummary() {
        return "Staff{" +
                "staffName='" + staffName + '\'' +
                ", staffSurname='" + staffSurname + '\'' +
                ", staffNumber='" + staffNumber + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", school=" + school.getSchoolName() +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffID == staff.staffID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(staffID);
    }
}
