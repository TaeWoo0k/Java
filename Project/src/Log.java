import java.util.Scanner;

public class Log {

	public Log (int a, int b) {
		//log2 8 = 3 
		int c=a;
		for(int i=1; i<b+1;i++) {
			if(a==b)
				System.out.println(i);
			a=a*c;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Loga B ���� �� a �� B�� ������� �Է��ϼ���.");
		new Log(scanner.nextInt(),scanner.nextInt());
	}
}