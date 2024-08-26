package com.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.entity.Department;
import com.jdbc.service.DepartmentService;

@RestController
public class DepartmentController {
	private final DepartmentService departmentService;

	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@PostMapping("/save")
	public Department createDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
}
