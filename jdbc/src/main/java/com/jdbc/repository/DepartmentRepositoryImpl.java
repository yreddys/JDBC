package com.jdbc.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.entity.Department;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
	private JdbcTemplate jdbcTemplate;

	public DepartmentRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int save(Department department) {
		String sql = "INSERT INTO department (name, address) VALUES (?, ?)";
		return jdbcTemplate.update(sql, department.getName(), department.getAddress());
	}
}
