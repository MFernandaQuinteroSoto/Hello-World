package Formas;
import java.util.Scanner;


public class PF2 {

		public static void RecorrerPF2(String cadena) {
			
			char[] digitos = cadena.toCharArray();     //Separa cada digito
			int[] VecInt;
			
			int i = 0, j = 1, p = 0; //Recorre cada vector.
			String s = "";
			int DU = 0;
			int n = 0;
			
			while (i < digitos.length) {
				if (digitos[i] != ' ') {
					if (digitos[i+1] == 'X') {
						n++;
					}
					if (digitos[i] == '^') {
						if (digitos[i+1] == '0') {
							n++;
							break;
						}
					}
					
				}
				i++;
			}
			
			DU = n*2;
			VecInt = new int[DU];
			i = 0;
			while (i < digitos.length) {
				//System.out.println("Caracteres divididos: [" + digitos[i] + "]" );
				
				if (digitos[i] == '-' ||  Character.isDigit(digitos[i])) {
					
					s = s + digitos[i];
					
					if (digitos[i+1] == '-') {
						s = "";
					}
					
					if (digitos[i] == '-' && digitos[i+1] == 'X') {
						s = "-1";
					}
					
				}else {
					
					if (digitos[i] == '+'){
						s = "";
					}
					
					if (digitos[i] == 'X') {
						i+=1;
						if (digitos[i] == '^') {
							
							if (VecInt[0] == 0) {
								VecInt[0] = n;
								VecInt[j] = Integer.parseInt(s);
								VecInt[j+1] = Character.getNumericValue(digitos[i+1]);
							}else {
								VecInt[j] = Integer.parseInt(s);
								VecInt[j+1] = Character.getNumericValue(digitos[i+1]);
							}
							j += 2;
						}
					}
					
					if (digitos[i] == '^') {
						if (digitos[i+1] == '0') {
							VecInt[j] = Integer.parseInt(s);
							break;
						}
					}
					s = "";
				}
				i+=1;
			}
			
			System.out.println("Forma 2 \n");
			for (int k = 0; k < VecInt.length; k++) {
				System.out.print("["+ VecInt[k] + "]");
			}
			
			//vec[pos] = s;
			//Ajuste(vec);
			//ReconstruirString(VecInt);
		}
		
		public static void ReconstruirString(int[] VecInt) {
			int DU = 0, pos = 0, exp = 0;		
			int i = 0, contTerm = 0, contCeros = 0;
			int[] VecFinal = new int[1];
			
			//Convierto el polinomio string a un vector entero
			for (int k = 0; k < VecInt.length; k++) {
				VecInt[k] = VecInt[k];
			}
			
			while (i < VecInt.length) {
				DU = VecInt[0] + 1;
				exp = DU - i;
				pos = DU - exp;
				VecFinal[pos] = VecInt[i];
				i++;
				
				if (VecInt[i] == 0) {
					contCeros = contCeros + 1;
				}
			}
			
			System.out.println("\n");
			for (int k = 0; k < VecInt.length; k++) {
				System.out.print("["+ VecInt[k] + "]");
			}
			
			
		}
		
		public static void Ajuste(String[] vec) {
			
			int[] VecPF1;
			int contTerm = 0, i = 0, j = 0;
			
			while (i < vec.length) {
				
				if (vec[i] != null) {
					contTerm = contTerm + 1;
				}else {
					
					if (vec[i] == null) {
						break;
					}
				}
				i++;			
			}
			i = 0;
			VecPF1 = new int[contTerm];
			while (j < VecPF1.length) {
				VecPF1[j] = Integer.parseInt(vec[i]);
				j++;
				i++;
			}
			for (int k = 0; k < VecPF1.length; k++) {
				System.out.print("["+ vec[k] + "]");
			}
			
		}
		
		public static void main(String[] args) {
			//String entrada = JOptionPane.showInputDialog("Ingrese el polinomio ya sea con exponentes en orden o viceversa \n Ej: 5X^4+12X^3-X+10");
			Scanner sc = new Scanner(System.in);
			
			//System.out.print("Ingrese el grado: ");
			//String grado = sc.nextLine();
			
			String entrada = "5X^4-12X^3+1X^1+8^0";
			RecorrerPF2(entrada);
		}
	}

