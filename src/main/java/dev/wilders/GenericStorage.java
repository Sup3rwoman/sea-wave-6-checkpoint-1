package dev.wilders;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {
    private List<T> itCrowd;

    public GenericStorage() {
        this.itCrowd = new ArrayList<>();
    }

    public boolean storePerson(T person) {

        return itCrowd.add(person);
    }

    public T getLastStoredPerson() {
        return itCrowd.get(itCrowd.size()-1);
    }

    public T getFirstStoredPerson() {
        return itCrowd.get(0);
    }

}
