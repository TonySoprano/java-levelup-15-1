package main.java.lecture20;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT employee_id, COUNT(employee_id) AS n FROM courses2staff GROUP BY employee_id HAVING n = 2;");
            System.out.printf("%10s | ", rs.getMetaData().getColumnName(1));
            System.out.printf("%11s | ", rs.getMetaData().getColumnName(2));
            System.out.println();
            System.out.println("---------------------------");
            while (rs.next()) {

                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {

                    System.out.printf("%11s | ", rs.getString(i));
                }
                System.out.println();
                System.out.println("---------------------------");
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
