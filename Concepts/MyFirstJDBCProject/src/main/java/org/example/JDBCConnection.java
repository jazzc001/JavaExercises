package org.example;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args)  {
        Connection connection = null;
        PreparedStatement preparedStatement;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyDI001", "root", "****");

            preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt("EMPLOYEEID");
                String name = resultSet.getString("NAME");
                System.out.println("emp id"+ id + "name " + name);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}
