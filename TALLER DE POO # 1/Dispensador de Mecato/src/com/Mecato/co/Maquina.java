package com.Mecato.co;

import java.util.ArrayList;

public class Maquina {
	
		private String nombre;
		private String marca;
		private int modelo;
		private Producto producto;
		private ArrayList<Producto> productos;
		private ArrayList<Producto> mecato = new ArrayList<>();

		public Maquina(String nombre, String marca, int modelo) {
			this.nombre = nombre;
			this.marca = marca;
			this.modelo = modelo;
			this.productos = new ArrayList<>();
		}

		public void agregarProducto(Producto producto) {
			this.producto = producto;
			mecato.add(this.producto);
		}

		public void sacarProducto(Producto producto) {
			if (mecato.indexOf(producto) != -1) {
				int posicion = mecato.indexOf(producto);
				if (mecato.get(posicion).getCantidad() > 0) {
					int z = mecato.get(posicion).getCantidad() - 1;
					mecato.get(posicion).setCantidad(z);
					System.out.println(
							"Quedaron " + mecato.get(posicion).getCantidad() + " " + mecato.get(posicion).getNombre());

				} else {
					System.out.println("No hay suficientes productos de " + mecato.get(posicion).getNombre());
				}
			} else {
				System.out.println("El producto " + producto + " no existe.");
			}

		}

		public void consultarAgotados() {
			for (int i = 0; i < mecato.size(); i++) {
				if (mecato.get(i).getCantidad() == 0) {
					System.out.println("El producto " + mecato.get(i).getNombre() + " está agotado.");
				}

			}

		}

		public void consultarCantidadProducto(Producto producto) {

			if (mecato.indexOf(producto) != -1) {
				int posicion = mecato.indexOf(producto);
				System.out.println("Hay " + mecato.get(posicion).getCantidad() + " " + mecato.get(posicion).getNombre());
			} else {
				System.out.println("El producto " + producto + " no existe.");
			}

		}

		public void consultarCantidadTotal() {
			int x = 0;
			for (int i = 0; i < mecato.size(); i++) {

				x += mecato.get(i).getCantidad();
			}
			System.out.println("Hay " + x + " unidades de productos en total.");
		}

		public void aumentarCantidadProducto(Producto producto, int incremento) {

			if (mecato.indexOf(producto) != -1) {

				int posicion = mecato.indexOf(producto);

				if ((mecato.get(posicion).getCantidad() + incremento) < 12) {

					int z = mecato.get(posicion).getCantidad() + incremento;
					mecato.get(posicion).setCantidad(z);
					System.out
							.println("Ahora hay " + mecato.get(posicion).getCantidad() +" " + mecato.get(posicion).getNombre());
				} else {
					System.out.println("No se pueden ingresar mas de 12 unidades de producto");
				}
			} else {
				System.out.println("El producto " + producto + " no existe.");
			}
		}

		public ArrayList<Producto> getMecato() {
			return mecato;
		}

		public void setMecato(ArrayList<Producto> mecato) {
			this.mecato = mecato;
		}

		public int getModelo() {
			return modelo;
		}

		public ArrayList<Producto> getProductos() {
			return productos;
		}

		public void setProductos(ArrayList<Producto> productos) {
			this.productos = productos;
		}

		public String getNombre() {
			return nombre;
		}

		public String getMarca() {
			return marca;
		}


}
