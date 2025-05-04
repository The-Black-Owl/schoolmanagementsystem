package reference;

import java.util.Objects;

public class Address {
    private int addressID;
    private final Enum<Province> province;
    private String streetName;
    private String building;

    public Address(int addressID, Enum<Province> province, String streetName, String building) {
        this.addressID = addressID;
        this.province = province;
        this.streetName = streetName;
        this.building = building;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }


    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String addressDetails() {
        return "Address{" +
                "building='" + building + '\'' +
                ", streetName='" + streetName + '\'' +
                ", province=" + province +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressID == address.addressID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(addressID);
    }
}
