package com.uce.edu.demo.universidad;

import java.time.LocalDateTime;

public class Estudiante {
	private String nombre;
	private String apellido;
	private LocalDateTime nacimiento;
	public Estudiante(String nombre,String apellido,LocalDateTime nacimiento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.nacimiento=nacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(LocalDateTime nacimiento) {
		this.nacimiento = nacimiento;
	}
}
