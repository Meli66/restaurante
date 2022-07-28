package service;

import java.util.ArrayList;
import java.util.List;

import domain.Cheff;
import domain.Cocinero;
import domain.Consumible;
import domain.Empleado;
import domain.Menu;
import domain.Mozo;
import domain.salon;
import domain.Mesa;

public class SalonService {
	
	
	public void crearEmpleado(String nombre,Integer legajo, String fechaDeIngreso, Boolean titulo, List<Empleado> empleados) {
		for(Empleado cheff:salon.getEmpleados()) {
			if(cheff.getLegajo() != legajo ) {
	          cheff = new Cheff(nombre, legajo, fechaDeIngreso, titulo);
			empleados.add(cheff);
			}
		}
		}
	
	public void crearEmpleado(String nombre, Integer legajo, String fechaDeIngreso, String tipoDeMozo, List<Mesa> mesas, List<Empleado> empleados) {
		for(Empleado mozo:salon.getEmpleados()) {
			if(mozo.getLegajo() != legajo ) {
	          mozo = new Mozo(nombre, legajo, fechaDeIngreso, tipoDeMozo, mesas);
			empleados.add(mozo);
			}
		}
		}
	
	
	public void crearEmpleado(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia, List<Empleado> empleados) {
		for(Empleado cocinero:salon.getEmpleados()) {
			if(cocinero.getLegajo() != legajo ) {
	          cocinero = new Cocinero(nombre, legajo, fechaDeIngreso, yearsDeExperiencia);
			empleados.add(cocinero);
			}
		}
		}
	
	
	
	

}
