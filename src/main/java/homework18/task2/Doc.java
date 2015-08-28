package homework18.task2;

import java.util.GregorianCalendar;

/**
 * Created by Ivan on 28.08.2015.
 */
public class Doc implements Comparable {
    private String name;
    private Integer number;
    private GregorianCalendar date;

    public GregorianCalendar getDate() {
        return date;
    }

    public Doc(String name, Integer number, GregorianCalendar date) {
        this.name = name;
        this.number = number;
        this.date = date;
    }


    @Override
    public String toString() {
        return "Doc{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", date=" + date.getTime() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Doc doc1 = (Doc)o;
        if (this.date.after(doc1.getDate())){
            return 1;
        }
        else if(this.date.before(doc1.getDate())){
            return -1;
        }
        return 0;
    }
}
