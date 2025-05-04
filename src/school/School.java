package school;

import reference.Address;

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
}
