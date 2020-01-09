import java.util.Scanner;

public class Redvelvet {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		String result = scanner.nextLine();
		String aq = "";
		
		
		int line=2,i,j,a=1;
		while(true) {
			
			if(result.contentEquals("Was it a cat I saw?")) {
			break;
		}
			
			else {
				for(i=0;i<result.length();i+=line) {
					if(i==0) {
						aq = Character.toString( result.charAt(0));
					}
					else
						aq += result.charAt(i);
					
				}
				result = scanner.nextLine();
				line+=1;
				a=0;
				System.out.println(aq);
			}

		}
		scanner.close();
	}
}


