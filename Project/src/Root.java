import java.util.Scanner;
public class Root {

	public Root(int root) {
		for(int i=1; i<root+1; i++) {
			if(i*i==root)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		new Root(scanner.nextInt());
	}
}
