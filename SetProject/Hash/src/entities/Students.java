package entities;

import java.util.*;

public class Students {
    private int ID;

    public Students(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public Students setID(int ID) {
        this.ID = ID;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return ID == students.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }
}
