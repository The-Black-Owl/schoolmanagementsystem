package parent;

import student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parent {
    private int parentID;
    private String name;
    private String surname;
    private String occupation;
    private String contact;

    public Parent(int parentID, String name,
                  String surname, String occupation, String contact) {
        this.parentID = parentID;
        this.name = name;
        this.surname = surname;
        this.occupation = occupation;
        this.contact = contact;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String parentDetails() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", occupation='" + occupation + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return parentID == parent.parentID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentID);
    }
}
