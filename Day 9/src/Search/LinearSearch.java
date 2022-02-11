package Search;

public class LinearSearch {
	   public static void main(String args[]){
	      int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      int value = 99;

	      for (int i=0 ;i< size; i++){
	         if(array[i]==value){
	            System.out.println("Element found index is :"+ i);
	         }
	         if(i==size-1&&array[i]!=value) {
	        	 System.out.println("Element Not Found");
	         }
	         }
	         
	   }
	}