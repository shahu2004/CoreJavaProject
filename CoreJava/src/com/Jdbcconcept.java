package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbcconcept {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/nice", "root", "root");

		PreparedStatement p = c.prepareStatement("update  user set name='shahu' where id=20 ");
		

		p.executeUpdate();

	}

}
