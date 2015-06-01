package com.ianbrandt.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@Import(DbConfig.class)
public class DbTestConfig {

	@Autowired
	public DataSource dataSource;

	@Bean
	public JdbcTemplate jdbcTemplate() {

		return new JdbcTemplate(dataSource);
	}
}
