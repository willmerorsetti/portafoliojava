package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Proveedor;
import net.javaguides.springboot.service.EmployeeService;
import net.javaguides.springboot.service.ProveedorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {

	private ProveedorService proveedorService;

	public ProveedorController(ProveedorService proveedorService) {
		super();
		this.proveedorService = proveedorService;
	}
	
	// build create employee REST API
	@PostMapping()
	public ResponseEntity<Proveedor> saveEmployee(@RequestBody Proveedor proveedor){
		return new ResponseEntity<Proveedor>(proveedorService.saveProveedor(proveedor), HttpStatus.CREATED);
	}

	// http://localhost:8080/api/proveedor/all
	// build get all employees REST API
	@GetMapping("/all")
	public List<Proveedor> getAllEmployees(){
		return proveedorService.getAllProveedor();
	}
	
	// build get employee by id REST API
	// http://localhost:8080/api/proveedor/1
	@GetMapping("{id}")
	public ResponseEntity<Proveedor> getEmployeeById(@PathVariable("id") long proveedorId){
		return new ResponseEntity<Proveedor>(proveedorService.getProveedorById(proveedorId), HttpStatus.OK);
	}
	
	// build update employee REST API
	// http://localhost:8080/api/proveedor/1
	@PutMapping("{id}")
	public ResponseEntity<Proveedor> updateEmployee(@PathVariable("id") long id
												  ,@RequestBody Proveedor proveedor){
		return new ResponseEntity<Proveedor>(proveedorService.updateProveedor(proveedor, id), HttpStatus.OK);
	}
	
	// build delete employee REST API
	// http://localhost:8080/api/proveedor/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
		
		// delete employee from DB
		proveedorService.deleteProveedor(id);
		
		return new ResponseEntity<String>("proveedor deleted successfully!.", HttpStatus.OK);
	}
	
}
