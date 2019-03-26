package com.Main.co;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import com.HerramientasTorneo.co.Jugador;

import com.HerramientasTorneo.co.Partido;

import com.HerramientasTorneo.co.Equipo;
import com.HerramientasTorneo.co.Fecha;
import com.HerramientasTorneo.co.Torneo;

public class Main {

	public static void main(String[] args) {
		
		//Equipo  #1
		
		Jugador jugador1 = new Jugador("ALEJO", 24, "arquero");
		Jugador jugador2 = new Jugador("FEDERICO", 34, "arquero");
		Jugador jugador3 = new Jugador("DANIEL", 21, "defensa");
		Jugador jugador4 = new Jugador("JESUS", 23, "defensa");
		Jugador jugador5 = new Jugador("CAMILO", 24, "defensa");
		Jugador jugador6 = new Jugador("SERGIO", 26, "defensa");
		Jugador jugador7 = new Jugador("HERNAN", 28, "defensa");
		Jugador jugador8 = new Jugador("ESTEBAN", 19, "defensa");
		Jugador jugador9 = new Jugador("ALBEIRO	", 20, "volante");
		Jugador jugador10 = new Jugador("WILSON", 20, "volante");
		Jugador jugador11 = new Jugador("JUAN", 23, "volante");
		Jugador jugador12 = new Jugador("CECHO", 25, "volante");
		Jugador jugador13 = new Jugador("EDWIN", 23, "volante");
		Jugador jugador14 = new Jugador("SMIHT", 24, "delantero");
		Jugador jugador15 = new Jugador("MATEO", 26, "delantero");
		Jugador jugador16 = new Jugador("JULIAN", 23, "delantero");
		
		//EL QUIPO MAS GRANDE DE COLOMBIA !!!!!!!!!!!!!!
		ArrayList<Jugador> jugadoresAtleticoNacional = new ArrayList<>(
				Arrays.asList(jugador1, jugador2, jugador3, jugador4, jugador5, jugador6, jugador7, jugador8, jugador9,
						jugador10, jugador11, jugador12, jugador13, jugador14, jugador15, jugador16));
		
		Equipo Nacional = new Equipo("nacional", "alejandro", "Atanacio", 29, jugadoresAtleticoNacional);
		
		
		// equipo2

				Jugador jugador01 = new Jugador("Andres", 24, "arquero");
				Jugador jugador02 = new Jugador("Carlos", 34, "arquero");
				Jugador jugador03 = new Jugador("Daniel", 24, "defensa");
				Jugador jugador04 = new Jugador("Francisco", 24, "defensa");
				Jugador jugador05 = new Jugador("ivan", 24, "defensa");
				Jugador jugador06 = new Jugador("Santiago", 24, "defensa");
				Jugador jugador07 = new Jugador("Yeison", 24, "defensa");
				Jugador jugador08 = new Jugador("Hernesto", 24, "defensa");
				Jugador jugador09 = new Jugador("Jasinto", 24, "volante");
				Jugador jugador010 = new Jugador("Pablo", 24, "volante");
				Jugador jugador011 = new Jugador("Juan", 24, "volante");
				Jugador jugador012 = new Jugador("Luis", 24, "volante");
				Jugador jugador013 = new Jugador("Alejandro", 24, "volante");
				Jugador jugador014 = new Jugador("martin", 24, "delantero");
				Jugador jugador015 = new Jugador("Jefferson", 24, "delantero");
				Jugador jugador016 = new Jugador("Mateo", 24, "delantero");
				

				ArrayList<Jugador> jugadoresmedellin = new ArrayList<>(Arrays.asList(jugador01, jugador02, jugador03,
						jugador04, jugador05, jugador06, jugador07, jugador08, jugador09, jugador010, jugador011, jugador012,
						jugador013, jugador014, jugador015, jugador016));

				Equipo medellin = new Equipo("medellin", "rogeñlio", "XXXXXX", 5, jugadoresmedellin);
				
				

				// equipo3

				Jugador jugadorr001 = new Jugador("Andres", 24, "arquero");
				Jugador jugador002 = new Jugador("Carlos", 34, "arquero");
				Jugador jugador003 = new Jugador("Daniel", 24, "defensa");
				Jugador jugador004 = new Jugador("Francisco", 24, "defensa");
				Jugador jugador005 = new Jugador("ivan", 24, "defensa");
				Jugador jugador006 = new Jugador("Santiago", 24, "defensa");
				Jugador jugador007 = new Jugador("Yeison", 24, "defensa");
				Jugador jugador008 = new Jugador("Hernesto", 24, "defensa");
				Jugador jugador009 = new Jugador("Jasinto", 24, "volante");
				Jugador jugador0010 = new Jugador("Pablo", 24, "volante");
				Jugador jugador0011 = new Jugador("Juan", 24, "volante");
				Jugador jugador0012 = new Jugador("Luis", 24, "volante");
				Jugador jugador0013 = new Jugador("Alejandro", 24, "volante");
				Jugador jugador0014 = new Jugador("martin", 24, "delantero");
				Jugador jugador0015 = new Jugador("Jefferson", 24, "delantero");
				Jugador jugador0016 = new Jugador("Mateo", 24, "delantero");
				

				ArrayList<Jugador> jugadoresmillonarios = new ArrayList<>(Arrays.asList(jugadorr001, jugador002, jugador003, jugador004,
						jugador005, jugador006, jugador007, jugador008, jugador009, jugador0010, jugador0011, jugador0012,
						jugador0013, jugador0014, jugador0015, jugador0016));

				Equipo millonarios = new Equipo("millonario", "carlos", "XXXXX", 14, jugadoresmillonarios);

				// equipo4

				Jugador jugadorr1111 = new Jugador("Andres", 24, "arquero");
				Jugador jugador2111 = new Jugador("Carlos", 34, "arquero");
				Jugador jugador3111 = new Jugador("Daniel", 24, "defensa");
				Jugador jugador4111 = new Jugador("Francisco", 24, "defensa");
				Jugador jugador5111 = new Jugador("ivan", 24, "defensa");
				Jugador jugador6111 = new Jugador("Santiago", 24, "defensa");
				Jugador jugador7111 = new Jugador("Yeison", 24, "defensa");
				Jugador jugador8111 = new Jugador("Hernesto", 24, "defensa");
				Jugador jugador9111 = new Jugador("Jasinto", 24, "volante");
				Jugador jugador10111 = new Jugador("Pablo", 24, "volante");
				Jugador jugador11111 = new Jugador("Juan", 24, "volante");
				Jugador jugador12111 = new Jugador("Luis", 24, "volante");
				Jugador jugador13111 = new Jugador("Alejandro", 24, "volante");
				Jugador jugador14111 = new Jugador("martin", 24, "delantero");
				Jugador jugador15111 = new Jugador("Jefferson", 24, "delantero");
				Jugador jugador16111 = new Jugador("Mateo", 24, "delantero");
				

				ArrayList<Jugador> jugadorescali = new ArrayList<>(Arrays.asList(jugadorr1111, jugador2111, jugador3111,
						jugador4111, jugador5111, jugador6111, jugador7111, jugador8111, jugador9111, jugador10111,
						jugador11111, jugador12111, jugador13111, jugador14111, jugador15111, jugador16111));

				Equipo cali = new Equipo("cali", "oscar", "XXXX", 5, jugadorescali);
				
				
				ArrayList<Equipo> equipostorneo = new ArrayList<>(
						Arrays.asList(Nacional,medellin,millonarios,cali));

				// fecha1

				ArrayList<Equipo> equipos1 = new ArrayList<>(Arrays.asList(cali, millonarios));
				ArrayList<Equipo> equipos2 = new ArrayList<>(Arrays.asList(Nacional,medellin));
				

				Partido partido1 = new Partido(2, 3, 95, "2:3", equipos1);
				Partido partido2 = new Partido(2, 3, 95, "2:3", equipos2);
			

				ArrayList<Partido> fech1 = new ArrayList<>(Arrays.asList(partido1, partido2 ));
				Fecha fecha1 = new Fecha("TORNEO FOX SPORTS", fech1);
				
				// fecha2

				ArrayList<Equipo> equipos11 = new ArrayList<>(Arrays.asList(cali, millonarios));
				ArrayList<Equipo> equipos12 = new ArrayList<>(Arrays.asList(Nacional,medellin));
				

				Partido partido11 = new Partido(2, 3, 95, "2:3", equipos11);
				Partido partido12 = new Partido(2, 3, 95, "2:3", equipos12);
			

				ArrayList<Partido> fech21 = new ArrayList<>(Arrays.asList(partido11, partido12 ));


				Fecha fecha2 = new Fecha("TORNEO FOX SPORTS", fech21);

				Torneo superCopa = new Torneo("200 dias", 1000000, equipostorneo, "SuperCopa");

				System.out.println("Bienvenido a la " + superCopa.getNombre() + " con una duración de "
						+ superCopa.getDuracion() + " con un premio de " + superCopa.getValorPremio() + " patrocionado por "
						+ superCopa.getPatrocinador());

				int hacer = Integer.parseInt(JOptionPane.showInputDialog(
						"Que decea hacer? \n 1.ver Equipos del Torneo \n 2.ver Partidos de una Fecha \n 3. ver la posicion de los jugadores de un Equipo"));

				switch (hacer) {
				case 1:
					System.out.println("los Equipos del torneo son: ");
					for (Equipo aa : equipostorneo) {
						System.out.print(aa.getNombre() + " ");

					}

					break;

				case 2:
					System.out.println("los partidos de la Fecha 1 son: ");
					for (Partido par : fecha1.getPartidos()) {

						System.out.println(par.getEquipos().get(0).getNombre() + " vs " + par.getEquipos().get(1).getNombre());
					}
					System.out.println(" "
							+ "\n los partidos de la Fecha 2 son: ");
					for (Partido par : fecha2.getPartidos()) {

						System.out.println(par.getEquipos().get(0).getNombre() + " vs " + par.getEquipos().get(1).getNombre());
					}
					break;

				case 3:
					int qw = Integer.parseInt(JOptionPane.showInputDialog("De Cual Equipo: \n 1.nacional"));

					switch (qw) {
					case 1:
						System.out.println("Las posiciones de los jugadores del nacional son: ");
						String er = JOptionPane.showInputDialog("Que posicion: arquero,defensa,delantero,volante");
						for (Jugador eq : Nacional.getJugadores()) {
							if (eq.getPosicion().equalsIgnoreCase(er)) {
								System.out.print("nombre  " + eq.getNombre() + "   ");

								System.out.println("posicion " + eq.getPosicion());

							}

						}
						break;

					default:
						break;
					}

				}

			}


	}


