package com.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.entity.Department;
import com.jdbc.repository.DepartmentRepository;

@Service
public class DepartmentService {
	private final DepartmentRepository departmentRepository;

	@Autowired
	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	public Department saveDepartment(Department department) {
		departmentRepository.save(department);
		return department;
	}

}
