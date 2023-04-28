package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
