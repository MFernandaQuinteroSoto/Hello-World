package MatricesDispersas;
import java.util.Scanner;

/* 
 *   Author: Maria F
 */

public class Tripletas {
	
	public static void main(String[] args) {
		
		//en el metodo principal hacer los llamados y pasar el código a un metodo llamado principal
		
		int[][] Matriz;
		int opc = 0, cont = 1, f = 0, c = 0, d = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de filas: ");
		int n = sc.nextInt();
		
		System.out.println("Ingrese la cantidad de columnas: ");
		int m = sc.nextInt();
		
		//n y m son datos adecuados por el usuario
		Matriz = new int[n][m];
		
		//instanciar la clase nodo con el objeto "matriz"
		
		
		Nodo matriz;
		
		do {
			
			System.out.print("Ingrese La Fila: ");
			f = sc.nextInt();
			
			System.out.print("Ingrese La Columna: ");
			c = sc.nextInt();
			
			System.out.print("Ingrese El Dato: ");
			d = sc.nextInt();
			
			
			Matriz[f][c] = d;
			cont = cont + 1;
			
			System.out.print("Desea ingresar otro dato: \n 1. Si \n 2. No \n");
			opc = sc.nextInt();	
			
		} while (opc == 1);
		
		matriz = new Nodo(cont);
		
		//Clase para construir la Tripleta
		matriz.construir(Matriz, n, m);
		
		//Recorrer y mostrar
		System.out.println(".... Matriz Dispersa ....");
		for (int i = 0; i < n; i++) {//Ciclo filas
			for (int j = 0; j < m; j++) { //Ciclo columnas
				System.out.print(Matriz[i][j]);
			}
			System.out.println("");
		}
		
	}
}
