package celula;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Celula> listaCelulas = new ArrayList<>();
		
		int opcion = elegirOpcion();
		
		ejecucion(opcion, listaCelulas);		
	}
	
	public static int elegirOpcion() {
	
		System.out.println("------------------");
		System.out.println("Elija una opción:");
		System.out.println("1 - Crear célula");
		System.out.println("2 - Mostrar células");
		System.out.println("3 - Borrar célula");
		System.out.println("------------------\n");
		
		Scanner sc = new Scanner (System.in);
		int opcion = sc.nextInt();
		
		return opcion;
	}
	
	//EJECUCION -> Incluye el ArrayList sobre el que trabajaremos
	public static void ejecucion (int opcion, ArrayList<Celula> listaCelulas) {
		
		switch (opcion) {
		case 1:
			listaCelulas.add(crearCelula());
			ejecucion(elegirOpcion(), listaCelulas);
		case 2:
			mostarCelulas(listaCelulas);
			ejecucion(elegirOpcion(), listaCelulas);
		case 3:
			listaCelulas.remove(borrarCelula(listaCelulas)-1);
			ejecucion(elegirOpcion(), listaCelulas);
		default:
			ejecucion(elegirOpcion(), listaCelulas);
		}
	}

	//Devuelve un objeto del tipo Celula
	public static Celula crearCelula () {
		System.out.println("------------------");
		System.out.println("¿Qué tipo de célula es?");
		System.out.println("1 - Procariota");
		System.out.println("2 - Eucariota");
		System.out.println("------------------\n");

		
		Scanner sc = new Scanner (System.in);
		int tipoCelula = sc.nextInt();
		
		switch (tipoCelula) {
			case 1:
				Celula procariota = new Procariota();
				procariota = datosProcariota(procariota);
				return procariota;
			case 2:
				Celula eucariota = new Eucariota();
				eucariota = datosEucariota(eucariota);
				return eucariota;
			default:
				System.out.println("Error\n");
				crearCelula ();	
		}
		return null;
		
	}
	
	public static Celula datosProcariota(Celula celula) {
		
		Procariota procariota = (Procariota) celula;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca los milimetros de la membrana: ");
		procariota.setMmMembrana(sc.nextDouble());
		System.out.println("Dime la densidad de del citoplasma: ");
		procariota.setDensidadCitoplasma(sc.nextDouble());
		System.out.println("Dime el peso: ");
		procariota.setPeso(sc.nextDouble());
		System.out.println("Dime el tama�o: ");
		procariota.setTamanyo(sc.nextDouble());
		System.out.println("Número de capas de la pared celular: ");
		procariota.setNumeroCapasParedCelular(sc.nextInt());
		
		return procariota;
	}
	
	public static Celula datosEucariota(Celula celula) {
		
		Eucariota eucariota = (Eucariota) celula;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca los milimetros de la membrana: ");
		eucariota.setMmMembrana(sc.nextDouble());
		System.out.println("Dime la densidad de del citoplasma: ");
		eucariota.setDensidadCitoplasma(sc.nextDouble());
		System.out.println("Dime el peso: ");
		eucariota.setPeso(sc.nextDouble());
		System.out.println("Dime el tama�o: ");
		eucariota.setTamanyo(sc.nextDouble());
		System.out.println("Tamaño núcleo: ");
		eucariota.setTamanyo(sc.nextDouble());
		System.out.println("N�mero de org�nulos: ");
		eucariota.setNumeroOrganulos(sc.nextInt());
		
		return eucariota;
	}
	
	public static ArrayList<Celula> mostarCelulas(ArrayList<Celula> listaCelulas) {
		for (Celula element : listaCelulas) {
			System.out.println(element.toString());
		}
		return listaCelulas;
	}
	
	public static int borrarCelula(ArrayList<Celula> listaCelulas) {
		
		System.out.println("De la siguiente lista, qué número quiere borrar?");
		
		for (int i = 0; i<listaCelulas.size(); i++){
			System.out.println(i+1 + " - " + listaCelulas.get(i).toString());
		}
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		return num;
	}

}
