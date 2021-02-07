package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html#package.description
		// auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver
		// class via Class.forName

		// register JDBC driver, optional since java 1.6
		/*
		 * try { Class.forName("oracle.jdbc.driver.OracleDriver"); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 */

		// Oracle SID = orcl , find yours in tnsname.ora
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system",
				"Password123")) {

			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// POM dependency

//<dependency>
//<groupId>com.oracle</groupId>
//<artifactId>ojdbc</artifactId>
//<version>8</version>
//<scope>system</scope>
//<systemPath>d:/projects/ojdbc8.jar</systemPath>
//</dependency>
