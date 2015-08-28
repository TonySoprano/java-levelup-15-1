package homework18.task1;



/**
 * Created by Ivan on 27.08.2015.
 */
public class Employee{

    private String name, sirName;
    private String inn;

    @Override
    public String toString() {
        return sirName + " " + name;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getSirName() {
        return sirName;
    }

    public String getInn() {
        return inn;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, String sirName) {
        this.name = name;
        this.sirName = sirName;

    }
}
