package rmstool;


/**
 * @author Fredrik Hansen
 *
 */
public class RMScalculator {

	static float getRMSint(int arr[]) 
	{ 
	    int square = 0; 
	    int n = arr.length;
	    for(int i = 0; i < n; i++) 
	    { 
	        square += Math.pow(arr[i], 2); 
	    } 	      
	    return (float)Math.sqrt(square / (float) (n)); 
	} 
	  
	static double getRMSdouble(double arr[]) {
		int n = arr.length;
	    int square = 0; 

		for(int i = 0; i < n; i++) 
	    { 
	        square += Math.pow(arr[i], 2); 
	    }   
	    return (float)Math.sqrt(square / (float) (n)); 
	}
	  
	public static void main(String args[]) 
	{ 
	    int arr[] = { 10, 4, 6, 8}; 
	    double arr3[] = { 10.0, 4.0, 6.0, 8.0};
	      
	    System.out.println("getRMS int    :"+getRMSint(arr));
	    System.out.println("getRMS double :"+getRMSdouble(arr3)); 

	} 	 
}
