package celula;

import java.util.ArrayList;
import java.util.Scanner;

import exceptions.NegativeException;

public class Main {
	
	public static void main(String[] args) {
		
		//ArrayList<Celula> listaCelulas = new ArrayList<>();
		
		int opcion = elegirOpcion();
		
		ejecucion(opcion);		
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
	public static void ejecucion (int opcion) {
		ArrayList<Celula> listaCelulas = new ArrayList<>();
		switch (opcion) {
		case 1:
			listaCelulas.add(crearCelula());
			ejecucion(elegirOpcion());
		case 2:
			mostarCelulas(listaCelulas);
			ejecucion(elegirOpcion());
		case 3:
			listaCelulas.remove(borrarCelula(listaCelulas)-1);
			ejecucion(elegirOpcion());
		default:
			ejecucion(elegirOpcion());
		}
	}

	//Devuelve un objeto del tipo Celula
	public static Celula crearCelula () {
		
		boolean sigue = true;
		
		while (sigue) {
			System.out.println("\n------------------");
			System.out.println("¿Qué tipo de célula es?");
			System.out.println("1 - Procariota");
			System.out.println("2 - Eucariota");
			System.out.println("------------------\n");
			
			Scanner sc = new Scanner (System.in);
			try {
				int tipoCelula = sc.nextInt();
				if (tipoCelula<0) throw new NegativeException();
				
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
			}catch(NegativeException e) {
				System.out.println(e.getMessage());
				crearCelula();
			}
		}
		return null;
	}
	
	public static Celula datosProcariota(Celula celula) {
		
		Procariota procariota = (Procariota) celula;
		Scanner sc = new Scanner(System.in);
		Double valor;
		int valorInt;
		boolean sigue = true;
		
		while (sigue) {
			try {
				System.out.println("Introduzca los milimetros de la membrana: ");
				valor = sc.nextDouble();
				if (valor<0) throw new NegativeException();
				procariota.setMmMembrana(valor);
				
				
				System.out.println("Dime la densidad de del citoplasma: ");
				valor = sc.nextDouble();
				if (valor<0) throw new NegativeException();
				procariota.setDensidadCitoplasma(valor);
				
				System.out.println("Dime el peso: ");
				valor = sc.nextDouble();
				if (valor<0) throw new NegativeException();
				procariota.setPeso(valor);
				
				System.out.println("Dime el tamaño: ");
				valor = sc.nextDouble();
				if (valor<0) throw new NegativeException();
				procariota.setTamanyo(valor);
				
				System.out.println("Número de capas de la pared celular: ");
				valorInt = sc.nextInt();
				if (valorInt<0) throw new NegativeException();
				procariota.setNumeroCapasParedCelular(valorInt);
				
				sigue = false;
				
			}catch (NegativeException e) {
				System.out.println(e.getMessage());
			}
		}
		return procariota;
	}
	
	public static Celula datosEucariota(Celula celula) {
		
		Eucariota eucariota = (Eucariota) celula;
		Scanner sc = new Scanner(System.in);
		Double valor;
		int valorInt;
		boolean sigue = true;
		
		while(sigue){
			try {
				System.out.println("Introduzca los milimetros de la membrana: ");
				valor = sc.nextDouble();
				if (valor <0) throw new NegativeException();
				eucariota.setMmMembrana(valor);
				
				System.out.println("Dime la densidad de del citoplasma: ");
				valor = sc.nextDouble();
				if (valor <0) throw new NegativeException();
				eucariota.setDensidadCitoplasma(valor);
				
				System.out.println("Dime el peso: ");
				valor = sc.nextDouble();
				if (valor <0) throw new NegativeException();
				eucariota.setPeso(valor);
				
				System.out.println("Dime el tamaño: ");
				valor = sc.nextDouble();
				if (valor <0) throw new NegativeException();
				eucariota.setTamanyo(valor);
				
				System.out.println("Tamaño núcleo: ");
				valor = sc.nextDouble();
				if (valor <0) throw new NegativeException();
				eucariota.setTamanyoNucleo(valor);
				
				System.out.println("Número de orgánulos: ");
				valorInt = sc.nextInt();
				if (valorInt <0) throw new NegativeException();
				eucariota.setNumeroOrganulos(valorInt);
				
				sigue = false;
				
			}catch (NegativeException e) {
				System.out.println(e.getMessage());
			}
		}
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
