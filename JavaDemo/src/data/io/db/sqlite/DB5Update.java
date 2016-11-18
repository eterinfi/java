package data.io.db.sqlite;

import java.sql.*;

public class DB5Update {
	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			c.setAutoCommit(false);
			System.out.println("Database opened successfully.");
			stmt = c.createStatement();
			String sql = "UPDATE COMPANY SET SALARY = 25000.00 WHERE ID = 1;";
			stmt.executeUpdate(sql);
			stmt.close();
			c.commit();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Record updated successfully.");
	}
}