package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Proveedor;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.repository.ProveedorRepository;
import net.javaguides.springboot.service.EmployeeService;
import net.javaguides.springboot.service.ProveedorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService{
	private  ProveedorRepository proveedorRepository;
	public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
		super();
		this.proveedorRepository = proveedorRepository;
	}
	@Override
	public Proveedor saveProveedor(Proveedor proveedor) {
		return proveedorRepository.save(proveedor);
	}
	@Override
	public List<Proveedor> getAllProveedor() {
		return proveedorRepository.findAll();
	}
	@Override
	public Proveedor getProveedorById(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
		return proveedorRepository.findById(id).orElseThrow(() ->
						new ResourceNotFoundException("Proveedor", "Id", id));
	}
	@Override
	public Proveedor updateProveedor(Proveedor proveedor, long id) {
		// we need to check whether employee with given id is exist in DB or not
		Proveedor existingProveedor = proveedorRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Proveedor", "Id", id));
		existingProveedor.setName(proveedor.getName());
		existingProveedor.setLastName(proveedor.getLastName());
		existingProveedor.setEmail(proveedor.getEmail());
		// save existing employee to DB
		proveedorRepository.save(existingProveedor);
		return existingProveedor;
	}
	@Override
	public void deleteProveedor(long id) {
		// check whether a employee exist in a DB or not
		proveedorRepository.findById(id).orElseThrow(() ->
								new ResourceNotFoundException("Proveedor", "Id", id));
		proveedorRepository.deleteById(id);
	}
	
}
