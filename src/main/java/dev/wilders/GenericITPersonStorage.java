package dev.wilders;

import java.util.ArrayList;
import java.util.List;

public class GenericITPersonStorage<ITPerson> {

    List<ITPerson> itCrowd = new ArrayList<>();

    public boolean storePerson(ITPerson person) {

        return itCrowd.add(person);
    }

    public ITPerson getLastStoredPerson() {
        return itCrowd.get(itCrowd.size()-1);
    }

    public ITPerson getFirstStoredPerson() {
        return itCrowd.get(0);
    }
}
