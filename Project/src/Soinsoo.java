import java.util.Scanner;
public class Soinsoo {

	int number;
	
	public Soinsoo(int number){
		this.number = number;
		int a,b,i;
		for(i=1;i<number;i++)		{	
			if(number%(i+1)==0) {
				System.out.println(i+1);
				number/=i+1;
				i-=1;
			//	System.out.println("number= "+number);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		new Soinsoo(scanner.nextInt());
	}
}
