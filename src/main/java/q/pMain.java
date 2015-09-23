package main.java.q;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class pMain {
    public static void main(String[] args) {
        //initFromH2();
        /*ArrayList<Person> pp = init();
		for (Person p : pp)
		{
			create(p);
		}*/
        //update();
        //delete();

        sort();

        //print(pp, 20, 50); // Age 20-50
        //print(pp); // Fn начин с 'A'
        //print1(pp);  // Ln заканч на 'f'
        //print1(pp, 10); // Id>10
        //print2(pp);  // Fn содержит 'v' не 1 и не последн
    }

    public static ArrayList<Person> initFromH2() {
        ArrayList<Person> pp = new ArrayList<Person>();

        try {
            Class.forName("org.h2.Driver").newInstance(); // "com.mysql.jdbc.Driver"
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "316017"); //jdbc:mysql://localhost
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Person");
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return pp;

    }

    public static void create(Person p) {
        try {
            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "316017");
            Statement stmt = con.createStatement();
            stmt.execute("Insert into Person values (" + p.Id + ", '" + p.Fn + "', '" + p.Ln + "', " + p.Age + " )");
            stmt.close();
            con.close();
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void update() {
        try {
            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "316017");
            Statement stmt = con.createStatement();
            stmt.execute("UPDATE PERSON SET Fn='Gdkgh', Ln='Ldfjghdfk' WHERE ID=5 ");
            stmt.close();
            con.close();
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void delete() {
        try {
            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "316017");
            Statement stmt = con.createStatement();
            stmt.execute("DELETE FROM PERSON WHERE ID=5 ");
            stmt.close();
            con.close();
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void sort() {
        try {
            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "316017");
            Statement stmt = con.createStatement();
            stmt.execute("SELECT * FROM Person ORDER BY Age ");
            stmt.close();
            con.close();
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> init() {
        ArrayList<Person> pp = new ArrayList<Person>();
        pp.add(new Person(1, "Vasya", "Petrov", 14));
        pp.add(new Person(2, "Kolya", "Ivanov", 15));
        pp.add(new Person(3, "Petr", "Sidorov", 12));
        pp.add(new Person(4, "Misha", "Hrenov", 16));
        pp.add(new Person(5, "Vova", "Ogurcov", 17));
        pp.add(new Person(6, "Sasha", "Ogur", 18));
        pp.add(new Person(7, "Gosha", "Ogcov", 19));
        pp.add(new Person(8, "Alosha", "Ogov", 23));
        pp.add(new Person(9, "Gosha", "Ogpyov", 27));
        pp.add(new Person(10, "Gosh", "Oguro", 34));
        pp.add(new Person(11, "Genya", "Agurcov", 45));
        pp.add(new Person(12, "Nik", "Ogurcoff", 78));
        pp.add(new Person(13, "Noshf", "Somova", 65));
        pp.add(new Person(14, "Kost", "Urcov", 54));
        pp.add(new Person(15, "Losha", "Popovich", 42));
        return pp;
    }

    public static void print(ArrayList<Person> pp, int x, int y) {
        for (Person p : pp) {
            if (p.Age >= x && p.Age <= y) {
                System.out.println(p);
            }
        }
    }

    public static void print(ArrayList<Person> pp) {
        for (Person p : pp) {
            if (p.Fn.charAt(0) == 'A') {
                System.out.println(p);
            }
        }
    }

    public static void print1(ArrayList<Person> pp) {
        for (Person p : pp) {
            if (p.Ln.charAt(p.Ln.length() - 1) == 'f') {
                System.out.println(p);
            }
        }
    }

    public static void print1(ArrayList<Person> pp, int x) {
        for (Person p : pp) {
            if (p.Id > x) {
                System.out.println(p);
            }
        }
    }
}
