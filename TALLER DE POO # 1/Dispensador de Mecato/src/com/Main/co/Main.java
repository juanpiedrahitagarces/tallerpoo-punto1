package com.Main.co;
import com.Mecato.co.Maquina;
import com.Mecato.co.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina maquina = new Maquina("DispensadoraInc", "DistribuiTodo", 2018);

		Producto jum = new Producto("jumbo", 1200, 7);
		Producto flow = new Producto("flow", 1300, 0);
		Producto sprite = new Producto("sprite", 1500, 10);
		Producto sal = new Producto("saltin", 500, 3);
		Producto trul = new Producto("trululu", 300, 12);
		Producto valle = new Producto("del valle", 2300, 5);
		Producto ramo = new Producto("chocoramo", 1100, 3);
		Producto boli = new Producto("boliquesos", 300, 0);
		Producto yog = new Producto("yogurts", 800, 0);
		Producto bon = new Producto("bonyourt", 2000, 0);

		maquina.agregarProducto(jum);
		maquina.agregarProducto(flow);
		maquina.agregarProducto(sal);
		maquina.agregarProducto(trul);
		maquina.agregarProducto(sprite);
		maquina.agregarProducto(valle);
		maquina.agregarProducto(ramo);
		maquina.agregarProducto(boli);
		maquina.agregarProducto(yog);
		maquina.agregarProducto(bon);

		System.out.println("Los productos de la maquina " + maquina.getNombre() + " son: ");
		for (int i = 0; i < maquina.getMecato().size(); i++) {
			System.out.println(" " + maquina.getMecato().get(i).getNombre());
		}

		maquina.sacarProducto(jum);
		maquina.sacarProducto(flow);
		maquina.sacarProducto(sal);

		maquina.consultarAgotados();

		maquina.consultarCantidadProducto(ramo);

		maquina.consultarCantidadTotal();

		maquina.aumentarCantidadProducto(yog, 10);
	}

	}


