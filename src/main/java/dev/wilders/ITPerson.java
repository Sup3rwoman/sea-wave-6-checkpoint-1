package dev.wilders;

import java.lang.reflect.Array;
import java.util.List;

public abstract class ITPerson {

    protected String name;

    public ITPerson(String name) {
        this.name = name;

    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean hasReadAccess();
    public abstract boolean hasWriteAccess();

}
