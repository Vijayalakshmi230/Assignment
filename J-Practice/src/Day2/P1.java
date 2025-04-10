package Day2;
import java.util.*;
public class P1 {
	public static void main(String[] args) {
		
	     Scanner sc= new Scanner(System.in);
	      int A[][]= new int [3][3];
	      
	      
	      for(int i=0;i<3;i++)
	      {
	    	  for(int j=0;j<3;j++)
	    	  {
	    		  
	    		  System.out.println("enter no");
	    		  A[i][j]=sc.nextInt();		    		  
	    	  }
	      }
	      
	      
	      
	      
	      
	      for(int i=0;i<3;i++)
	      {
	    	  for(int j=0;j<3;j++)
	    	  {
	    		
	    		  System.out.print(A[i][j]+  "   ");
	    	  }
   		  System.out.println("");
	      }
	}

}
