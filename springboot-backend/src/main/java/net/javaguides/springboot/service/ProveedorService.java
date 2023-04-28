package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Proveedor;

import java.util.List;

public interface ProveedorService {
	Proveedor saveProveedor(Proveedor proveedor);
	List<Proveedor> getAllProveedor();
	Proveedor getProveedorById(long id);
	Proveedor updateProveedor(Proveedor proveedor, long id);
	void deleteProveedor(long id);
}
