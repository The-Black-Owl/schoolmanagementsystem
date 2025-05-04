package school;

import reference.Address;

import java.util.Objects;

public class School {
    private int schoolID;
    private String schoolName;
    private Address address;
    private String district;

    public School(int schoolID, String schoolName, Address address, String district) {
        this.schoolID = schoolID;
        this.schoolName = schoolName;
        this.address = address;
        this.district = district;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String schoolDetails() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address=" + address +
                ", district='" + district + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return schoolID == school.schoolID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(schoolID);
    }
}
