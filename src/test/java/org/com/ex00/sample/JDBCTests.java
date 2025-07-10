package org.com.ex00.sample;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;


//        CREATE DATABASE springdb;
//
//        CREATE USER 'springdbuser'@'localhost' IDENTIFIED BY 'springdbuser';
//        CREATE USER 'springdbuser'@'%' IDENTIFIED BY 'springdbuser';
//
//        GRANT ALL PRIVILEGES ON springdb.* TO 'springdbuser'@'localhost';
//
//        GRANT ALL PRIVILEGES ON springdb.* TO 'springdbuser'@'%';

public class JDBCTests {

  @Test
  public void testConnection() throws Exception{

    //DB Driver Class
    Class.forName("com.mysql.cj.jdbc.Driver");
    //URL
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springdb","root", "goboram");

    System.out.println(connection);

    connection.close();
  }
}
