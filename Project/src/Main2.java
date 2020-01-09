import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int n,a,b;
		int tmp,i,j;
		n=scanner.nextInt();
		a=scanner.nextInt();
		b=scanner.nextInt();
		if(b<a) {	//a가 작게
			tmp=b;
			b=a;
			a=tmp;
		}
	
		//a = a+2^(n-1) b = b-2^(n-1)
		// n 구하기

	for(i = 1; i<n;i++) {
		tmp=1;
		for(j=1;j<i;j++) {
			tmp *=2;
		}
			a+=tmp;
			b-=tmp;
			//System.out.println("i = "+i+"  a= "+a+"  b = "+b);
			if(a==b) {
				System.out.println(i);
				break;
			}
		
			else if (a>b || a<0 || b<0 || a>n || b>n) {
				System.out.println(-1);
				break;
			}
		}
	}
}
