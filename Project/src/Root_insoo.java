import java.util.Scanner;

public class Root_insoo {
	
     int X1,X2;
     
	 Root_insoo(int A, double b, int c) {
	        int arr[] = new int[10];
	        double d = (b*b)-(4*A*c);
	        double root=1, res = 1;
	        int a =-1;
	        double x1 = 0, x2 = 0;
	        String D;
	        for (int i = 0; i < arr.length; i++)
	            arr[i] = 0;
	       
	        for (int i = 2; i < d + 1; i++) {
	        	a++;
	        	if (d % i == 0) {
	                arr[a] = i;
	                d /= i;
	                i -= 1;
	            }
	        }
	        	        
	        for(int q=0; q<arr.length;q++){
	             if(arr[q]!=0 ){
	                if(arr[q]==arr[q+1]) {
	                     root *= arr[q];
	                     arr[q] = 0;
	                     arr[q + 1] = 0;
	                 }
	                else
	                 res *= arr[q];
	             }  
	             }
	       if(res == 1) {
	        x1 = ((-b+root) / (2*A));
	        x2 = ((-b-root) / (2*A));
	        
	       }
	       if(d==0) {
	    	   x1 = -b/(2*A);
	    	   x2 = -b/(2*A); 
	       }
	       else {
	    	   x1 = -b/(2*A);
	    	   x2 = -b/(2*A); 
	       }
	       if(x1%1.0==0)
	    	   System.out.println("!@#!@#");
	       if(d>0) {
	    	
	             if(res==1) {
	             System.out.println(x1);
	             System.out.println(x2);
	             }
	             else if(root == 1 && res ==1) 
	            	 System.out.println(1);
	             else if(root == 1) {
	            	 System.out.println(2);
	            	System.out.println(x1+"+"+"√"+res);
	            	System.out.println(x2+"-"+"√"+res);
	             }
	             else {
	            	 System.out.println(x1+"+"+"√"+res);
	            	 System.out.println(x2+"-"+"√"+res);
	             }
	       }
	       else if(d==0) {
		    	  if(x1>0)
		    		System.out.println(x1);  
		    	  else
		    		  System.out.println(x2);
		       }
	       else
	    	   System.out.println("해가 없습니다.");
	      
	  
	       System.out.println("res"+res);
	 }
	 public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		new Root_insoo(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		
	 }
}
