import java.util.*;
public class Pack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		long number=1;
		
		Scanner scanner = new Scanner(System.in);
		
		for(i=scanner.nextInt();i>0;i--) {
			number *= i; 
		}
		System.out.println(number);
	}

}
