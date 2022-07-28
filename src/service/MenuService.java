package service;

import java.util.ArrayList;
import java.util.List;

import domain.Consumible;
import domain.Menu;
import domain.Plato;
import domain.salon;
import service.ConsumibleService;

public class MenuService {
	
	
	public ConsumibleService menuService(ConsumibleService consumibleService) {
		return new ConsumibleService();
	}
	
	public List<Menu> crear(List<Menu> menus) {
		return  menus=new ArrayList<Menu>(menus);
		
	}
	
	public void agregarConsumible(List<Menu> menus,List<Consumible> consumibles) {
		menus.add((Menu) consumibles);
	}
	
	public void borrarConsumible(List<Menu> menus,List<Consumible> consumibles) {
		menus.remove((Menu) consumibles);
	}
	public Menu obtenerBebidas(List<Menu> menus) {
		for(Menu bebidas:salon.getMenus()) {
			if(bebidas!=null) {
				return bebidas;
			}
		}
		return null;
		
	}
	public Menu obtenerPlatos(List<Menu> menues) {
		for(Menu platos:salon.getMenus()) {
			if(platos!=null) {
				return platos;
			}
		}
		return null;
		
	}
	public void obtenerTipoMenu(String nombre,String tipoMenu,List<Menu> menues ) {
			obtenerPlatos(menues);
				if(Plato.getAptoVegano()==true){
					tipoMenu="vegano";
						System.out.println("el menu es del tipo: "+tipoMenu);
				} else if (Plato.getAptoCeliaco()==true) {
						tipoMenu="celiaco";
						System.out.println("el menu es del tipo: "+tipoMenu);
				}else {tipoMenu="tradicional";	
						System.out.println("el menu es del tipo: "+tipoMenu);
		}
	}

	
	
	
	

}
