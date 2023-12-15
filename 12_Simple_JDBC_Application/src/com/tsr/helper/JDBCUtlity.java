package com.tsr.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtlity {

	private static Properties properties = new Properties();

	static {
		try {
			properties.load(JDBCUtlity.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(properties.getProperty("driverClassName"));
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Failed to load Properties or JDBC Class");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection connection = null;
		String URL = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		connection = DriverManager.getConnection(URL, user, password);
		return connection;
	}
}
