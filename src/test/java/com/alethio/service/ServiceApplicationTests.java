package com.alethio.service;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class ServiceApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	Connection connection;

	@Before
	void setUp() throws SQLException {
		if(connection==null) {
			connection = dataSource.getConnection();
			System.out.println("before");
		}
	}

	@After
	public void disconnect() throws SQLException {
		connection.close();
	}

	@Test
	void h2Load() throws SQLException {
		if(!connection.isClosed()){
			connection = dataSource.getConnection();
			System.out.println("connection: "+connection);
		}
	}

}
