package Formas;

import java.util.Scanner;

public class TestPF3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PF3List list = new PF3List();
		boolean salir = false;
		int opcion;
		
		while (!salir) {
			System.out.print(".......... Menú ..........\n");
			System.out.print("1. Ingresar lista         \n");
			System.out.print("2. Eliminar nodo          \n");
			System.out.print("3. Salir                  \n");
			
			System.out.print("Escribe una opción:       \n");
			opcion = sc.nextInt();
		
			switch (opcion) {
				case 1:
					System.out.print("Ingrese el coeficiente: ");
					int coefi = sc.nextInt();
					System.out.print("Ingrese el exponente: ");
					int expo = sc.nextInt();
					list.ingresar(coefi,expo);
					break;
					
				case 2:
					System.out.print("Ingrese el exponente del nodo a liminar: ");
					int Dltexp = sc.nextInt();
					list.eliminar(Dltexp);
					break;
					
				case 3:
					salir = true;
					break;
					
				default:
					System.out.println("Solo opciones 1 y 3");
			}
		}
		list.print();		
	}
}
