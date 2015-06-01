package com.ianbrandt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DbTestConfig.class)
public class DbTest {

	public static final int EXPECTED = 1;

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Test
	public void testDb() {

		final Integer queryResult = jdbcTemplate.queryForObject("select " + EXPECTED, Integer.class);

		assertThat(queryResult).isEqualTo(EXPECTED);
	}
}
