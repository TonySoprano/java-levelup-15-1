package main.java.lecture11.part1;

public class Container {
    private Object[] mass = new Object[10];
    private int i = 0;

    public int addMass(Object object) {
        mass[i] = object;
//        if (i == 11) {
//            Object[] temp = mass;
//            mass = new Object[2];
//            mass[i] = object;
//        }
        return i++;
    }

    //    public void setMass(Object[] mass) {
//        this.mass = mass;
//    }
//    public Object[] getMass() {
//        return mass;
//    }
    public Object getMass(int index) {
        return mass[index];
    }

    public void delMass() {
        for (int t = 0; t < mass.length; t++) {
            mass[t] = null;
        }
        i=0;
    }

}
