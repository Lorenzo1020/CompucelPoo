package ClasesProyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar nuestras variables
		// Librerias: Son clases desarrollados por alguien mas para que nuestras
		// aplicaciones funcionen correcatemnte

		Scanner lectura = null;

		String clave;
		String marca;
		String modelo;
		int existencia; 
		float precio;

		System.out.println("Nuevo mensaje para mostrar en consola");
		
		// Variable de tipo objeto
		Computadoras computadora = null;

		// Declaracion de lista
		List<Computadoras> lista = new ArrayList<Computadoras>();

		int menuPrin, subMenu, indice;

		do {
			System.out.println("BIENVENIDO AL SISTEMA");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR POR INDICE");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR POR INDICE");
			System.out.println("6----BUSCAR POR MODELO"); //SOLO SE MOSTRARA 1 REGISTRO
			System.out.println("7----BUSCAR POR MARCA"); //SE MOSTRARAN VARIOS REGISTROS
			System.out.println("8----CALCULAR DINERO INVERTIDO");
			System.out.println("9----ELIMINAR POR MODELO"); //SOLO SE ELIMINARA 1 REGISTRO
			System.out.println("10----SALIR");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {
			case 1:

				try {
					System.out.println("Ingrese la clave");
					lectura = new Scanner(System.in);
					clave = lectura.nextLine();

					System.out.println("Ingresa la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingresa el modelo");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();

					System.out.println("Ingresa la existencia");
					lectura = new Scanner(System.in);
					existencia = lectura.nextInt();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					// Crear el objeto
					computadora = new Computadoras(clave, marca, modelo, existencia, precio);

					// Agregar el objeto a la lista
					lista.add(computadora);
					System.out.println("Se agrego nuevo registro");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				System.out.println(lista);
				break;
			case 3:
				System.out.println("Registros por indice en la lista");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + i + "] " + lista.get(i).getMarca());
				}

				try {
					System.out.println("Ingresa el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Busqueda
					computadora = lista.get(indice);
					System.out.println("Se encontro " + computadora);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar " + e.getMessage());
				}
				break;
			case 4:
				// Para editar primero hay que buscar

				System.out.println("Registros por indice en la lista");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + i + "] " + lista.get(i).getMarca());
				}

				try {
					System.out.println("Ingresa el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Busqueda
					computadora = lista.get(indice);
					System.out.println("Se encontro " + computadora.getMarca());

					// precio y modelo
					do {
						System.out.println("SUBMENU PARA EDITAR");
						System.out.println("1----MODELO");
						System.out.println("2---PRECIO");
						System.out.println("3---SALIR");
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingrese el nuevo modelo");
							lectura = new Scanner(System.in);
							modelo = lectura.nextLine();

							// Actualizacion
							computadora.setModelo(modelo);
							System.out.println("Se edito");
							break;
						case 2:
							break;
						case 3:
							break;
						}

					} while (subMenu < 3);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar o editar " + e.getMessage());
				}

				break;
			case 5:
				System.out.println("Registros por indice en la lista");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + i + "] " + lista.get(i).getMarca());
				}

				try {
					System.out.println("Ingresa el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminacion
					lista.remove(indice);
					System.out.println("Se elimino con exito");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}

				break;
			case 6:
				
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			}

		} while (menuPrin < 10); // Vamos a estar entrando mientras menuPrin sea menor a 6; si es 6 o mayor se
								// sale

	}

}
