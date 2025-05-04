package school;

import reference.Address;
import staff.Staff;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;

public class SchoolManagement {
    HashSet<School> schools=new HashSet<>();
    HashMap<School,List<Staff>> staffMembersInSchool=new HashMap<>();
    //register school
    public boolean registerSchool(int schoolID, String schoolName, Address address, String district){
        return schools.add(new School(schoolID,schoolName,address,district));
    }
    //get all school by district
    public List<School> getAllSchoolsByDistrict(String district){
        List<School> schoolsPerDistrict=new ArrayList<>();
        for(School school:schools){
            if(school.getDistrict().equals(district)){
                schoolsPerDistrict.add(school);
            }
        }
        return schoolsPerDistrict;
    }
    //allocate staff to school
    public HashMap<School,List<Staff>> getSchools(School school,Staff staff) {
        if (!staffMembersInSchool.containsKey(school)){
            staffMembersInSchool.put(school,new ArrayList<>());
        }
        staffMembersInSchool.get(school).add(staff);
        return staffMembersInSchool;
    }
    //remove staff member from school
    public void removeStaffMember(School school,Staff staff){
        if(staffMembersInSchool.containsKey(school)){
            staffMembersInSchool.get(school).remove(staff);
        }
    }
}
