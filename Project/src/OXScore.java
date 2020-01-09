import java.util.Scanner;

public class OXScore {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int score=0,tmp=1;
		String a ;
		
		for(int j=0; j<num;j++) {
			score=0;
			tmp=0;
			a = scanner.next();
			for(int i = 0; i<a.length();i++) {
				if(a.charAt(i)=='X') {
					tmp=0;
					continue;
				}
			
				tmp++;
				score+=tmp;
			}
		System.out.println(score);
		}
		
	}
}
