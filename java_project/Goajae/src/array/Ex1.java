package array;

public class Ex1 {

			
	public static int miniValue(int[] arr) {
		  int min = arr[0];
		  for(int i=1; i<arr.length; i++) {
		   if(min>arr[i]) {
		    min =arr[i];
		   }
		  }
		  return min;
		  
		 }	
	 public static int maxValue(int[] arr) {
		  int max = arr[0];
		  for(int i=1; i<arr.length; i++) {
		   if(max<arr[i]) {
		    max=arr[i];
		   }
		  }
		  return max;
		 }
		
	
}
