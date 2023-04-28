package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Proveedor")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "rif")
	private String lastName;
	
	@Column(name = "email")
	private String email;
}
