package Formas;

public class PF1 {
	
	public static void RecorrerPF1(String cadena) {
		
		//Vectores
		char[] digitos = cadena.toCharArray();
		int[] VecInt = new int[digitos.length];
		
		//Variabbles 
		int DU = 1, pos = 0, exp = 0;
		int grado = 0, i = 0, j = 1;
		String s = "";
		
		while (i < digitos.length) {
			//System.out.println("Caracteres divididos: [" + digitos[i] + "]" );
			
			if (digitos[i] == '-' ||  Character.isDigit(digitos[i])) {
				
				s = s + digitos[i];
				
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
							DU = Character.getNumericValue(digitos[i+1]) + 2;
							VecInt = new int[DU];
							DU = DU - 1;
							VecInt[0] = Character.getNumericValue(digitos[i+1]);
							exp = DU - j;
							pos = DU - exp;
							if (pos == j) {
							VecInt[j] = Integer.parseInt(s);
							j = j + 1;
							}
						}
						
						grado = Character.getNumericValue(digitos[i+1]);
						
						if (VecInt[0] < grado) {
							DU = Character.getNumericValue(digitos[i+1]) + 1;
							VecInt[0] = grado;
							
						}
						
						if (VecInt[0] > grado) {
							
							exp = DU - j;
							
							if (exp != grado) {
								while (exp > grado) {
									VecInt[j] = 0;
									exp = exp - 1; //6 5 4 3 1
									j++; //3 4 5 6 7 8
								}
							}
							
							if (exp == grado) {
								pos = DU - exp;
								if (pos == j) {
									VecInt[j] = Integer.parseInt(s);
									j = j + 1;
								}
							}
						}
					}
				}	
				if (digitos[i] == '^' && digitos[i+1] == '0') {
					exp = DU - j;
					pos = DU - exp;
					if (pos == j) {
						VecInt[j] = Integer.parseInt(s);
					}
				}
				s = "";
			}
			i+=1;
		}
		
		System.out.println("Forma 1 \n");
		for (int k = 0; k < VecInt.length; k++) {
			System.out.print("["+ VecInt[k] + "]");
		}
		
		
		//vec[pos] = s;
		//Ajuste(vec);
		//ReconstruirString(VecInt);
	}
/* ---------------------------------------------------------------------------------------------------------------------------------- */
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
	
/* ---------------------------------------------------------------------------------------------------------------------------------- */
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
	
/* ---------------------------------------------------------------------------------------------------------------------------------- */
	public static void main(String[] args) {
		
		//String entrada = JOptionPane.showInputDialog("Ingrese el polinomio ya sea con exponentes en orden o viceversa \n Ej: 5X^4+12X^3-X+10");
		String entrada = "-5X^8+12X^3-X^1+12^0";
		RecorrerPF1(entrada);
		
	}
}

