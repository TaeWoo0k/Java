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
		System.out.println("Loga B 에서 밑 a 와 B를 순서대로 입력하세요.");
		new Log(scanner.nextInt(),scanner.nextInt());
	}
}