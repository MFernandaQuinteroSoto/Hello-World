package MatricesDispersas;

/*   Tareas: 
       - Construir
       - Insertar
       - Eliminar
       - Sumar Fila
       - Sumar Columna
       - Sumar Tri A + B
       - Multi Tri A + B
*/

public class Nodo {
	
	 private int[][] Tri;
	 private int N;
	
	 
	//el conatador que se manda desde la clase Tripletas sirve para crear la 
	//tripleta con 3 columnas y el # "N" de filas dependiento la cantidad de datos
	public Nodo(int N) {
		this.N = N;
		Tri = new int[N][3];
	}
	
	
	//En construir, se manda la matriz con los datos del usuario
	//se manda también las filas "n" y las columnas "m"
	void construir(int[][] Matriz, int n, int m) {
		
		int k = 1;
		Tri[0][0] = n;  //Número de filas en la matriz
		Tri[0][1] = m;  //Número de columnas en la matriz
		Tri[0][2] = N;  //Número de datos diferentes a 0
		
		//Los "for" recorre la matriz dispersa y pasa los datos a la tripleta
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (Matriz[i][j] != 0) {
					Tri[k][0] = i;
					Tri[k][1] = j;
					Tri[k][2] = Matriz[i][j];
					k++;
				}
			}
		}
		mostrar(Tri,k);
		
	}
	
	void mostrar(int[][] Tri, int k) {
		System.out.println(".... Tripleta ....");
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(Tri[i][j]);
			}
			System.out.println("");
		}
	}

	void EliminarTripleta (int dato, int n, int m) {
		
		for (int i = 1; i < Tri.length; i++) {
			if ((Tri[i][0] == n) && (Tri[i][1] == m)) {
				if (Tri[i][2] == dato) {
					Tri[i][0] = 0;
					Tri[i][1] = 0;
					Tri[i][2] = 0;
				}
			}
			Tri[i][0] = Tri[i+1][0];
			Tri[i][1] = Tri[i+1][1];
			Tri[i][2] = Tri[i+1][2];
		}
		
	}
	
	void SumarPorFila () {
		
	}
	
	void Redimension(int[][] Matriz, int n, int m) {
		
	}
}
