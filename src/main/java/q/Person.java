package main.java.q;

public class Person {
    int Id;
    String Fn;
    String Ln;
    int Age;

    Person(int Id, String Fn, String Ln, int Age) {
        this.Id = Id;
        this.Fn = Fn;
        this.Ln = Ln;
        this.Age = Age;
    }

    @Override
    public String toString() {
        String x = "Id = " + Id;
        x += ", Fn = " + Fn;
        x += ", Ln = " + Ln;
        x += ", Age = " + Age;
        return x;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFn() {
        return Fn;
    }

    public void setFn(String fn) {
        Fn = fn;
    }

    public String getLn() {
        return Ln;
    }

    public void setLn(String ln) {
        Ln = ln;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
