package MatricesDispersas;

public class For_Each {

	  public static void main(String[] arg){
	        
	            int[] marks = { 125, 132, 95, 116, 110 };
	             
	            int highest_marks = maximum(marks);
	            System.out.println("El puntaje más alto es " + highest_marks);
	        
	  }
	  
	    public static int maximum(int[] numbers){
	    	
	    	int i=0;
	        int[] maxSoFar = numbers;
	         
	        // bucle for each
	        for (int num : numbers){
	            if (num > maxSoFar[i])
	            {
	                maxSoFar[i] = num;
	            }
	        }
	    return maxSoFar[i];
	    }
}
