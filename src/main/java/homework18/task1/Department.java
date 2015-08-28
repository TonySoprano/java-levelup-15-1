package homework18.task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;


/**
 * Created by Ivan on 28.08.2015.
 */
public class Department {
    private String name;
    private Employee director;
    private HashSet<Employee> listOfEmploees;


    public void setDirector(Employee director) {
        this.director = director;
    }

    public void setListOfEmploees(HashSet<Employee> listOfEmploees) {
        this.listOfEmploees = listOfEmploees;
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", director=" + director +
                ", listOfEmploees=" + Arrays.toString(listOfEmploees.toArray()) +
                '}';
    }
}
