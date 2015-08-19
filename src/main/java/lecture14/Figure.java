package main.java.lecture14;


public abstract class Figure {

    String name;
    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                '}';
    }



    public abstract double area();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

