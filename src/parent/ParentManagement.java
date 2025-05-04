package parent;

import reference.Address;
import reference.Province;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParentManagement {
    HashMap<Parent, Address> parentLocation=new HashMap<>();
    HashMap<Address, List<Parent>> locationParents=new HashMap<>();

    public Parent registerParent(int parentID, String name,
                                 String surname, String occupation, String contact){
        return new Parent(parentID,name,surname,occupation,contact);
    }

    public Address createAddress(int addressID, Enum<Province> province, String streetName, String building){
        return new Address(addressID,province,streetName,building);
    }

    public void allocateParentToAddress(Parent parent,Address address){
        parentLocation.put(parent,address);
        if(!locationParents.containsKey(address)){
            locationParents.put(address,new ArrayList<>());
        }
        locationParents.get(address).add(parent);
    }

    public List<Parent> getAllParentsInLocation(Address address){
        return locationParents.get(address);
    }
}
