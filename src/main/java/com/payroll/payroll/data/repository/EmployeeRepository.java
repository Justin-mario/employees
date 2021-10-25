package com.payroll.payroll.data.repository;

import com.payroll.payroll.data.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
