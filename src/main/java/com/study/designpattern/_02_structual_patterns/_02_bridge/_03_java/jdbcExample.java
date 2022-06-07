package com.study.designpattern._02_structual_patterns._02_bridge._03_java;

import java.sql.*;

public class jdbcExample {

    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("org.h2.driver");

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {

            String sql = " CREATE TABLE ACCOUNT " +
                    " (id INTEGER not NULL " +
                    " email VARCHAR(255) " +
                    " password VARCHAR(255)" +
                    " PRIMARY KEY (id)) ";

            Statement statement = conn.createStatement();
            statement.executeQuery(sql);

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);


            /*
                DriverManager, Statement, Connection 추상화(Abstraction) 쪽
                Driver 구체적인(Implementation) 쪽
             */
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
