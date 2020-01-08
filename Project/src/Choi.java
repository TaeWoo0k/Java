import java.util.*;
public class Choi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		int a,b,r=1,q,p,w=1,tmp;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		if(a<b) {
			q=a;
			p=b;
		}
		else {
			q=b;
			p=a;
		}
		tmp=q;
		for(i=2;i<q+1;i++) {
			if(a%i ==0 && b%i==0) {
				a/=i;
				b/=i;
				q/=i;
				r*=i;
				i-=1;
			}
		}
		w = (tmp/r)*p;
			System.out.println(r);
			System.out.println(w);
	}

}
