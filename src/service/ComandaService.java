package service;

import java.util.List;

import domain.Cocinero;
import domain.Comanda;
import domain.Consumible;
import domain.FormaDePago;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;

public class ComandaService {
	
	public ComandaService ComandaService(MenuService menuService, SalonService salonService, MesaService mesaService) {
		
		return new ComandaService();
		
	}
	
	
	public Comanda crearComanda(Mesa mesa, Mozo mozo, Cocinero cocinero, Menu menu, FormaDePago formaDePago) {
		
		
		return new Comanda(menu, mesa, mozo, cocinero, formaDePago);
		
	}
	
	
	public void agregarConsumible(List<Comanda> comandas, List<Consumible> consumibles) {
		
		
		comandas.add((Comanda) consumibles);
		
		
	}
	
	
	
	
	
	

}
