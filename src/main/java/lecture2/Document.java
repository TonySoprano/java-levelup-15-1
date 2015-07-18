package lecture2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Mazai on 27.06.2015.
 */
public class Document {
    public Date date;
    public Integer number;
    public Float sum;
    public User author;

    Document(Integer number,Float sum, String strAuthor){
        this.date = new GregorianCalendar().getTime();
        this.number = number;
        this.sum = sum;
        this.author = new User(strAuthor);
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", date=" + new SimpleDateFormat("dd.MM.y").format(date) +
                ", Sum=" + sum +
                ", author=" + author.name +
                '}';
    }
}
