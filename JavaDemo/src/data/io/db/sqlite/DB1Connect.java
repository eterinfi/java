package data.io.db.sqlite;

import java.sql.*;

public class DB1Connect {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Database opened successfully.");
	}
}