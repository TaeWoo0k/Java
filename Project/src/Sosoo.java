import java.util.Scanner;

 public class Sosoo{	
	 public Sosoo(int number) {
		 int b=number,c,count=0;
		 for(int j=2;j<b+1;j++) {
			 c=j;
		 for(int i=2;i<c+1;i++) {
				 if(c%i==0) {
					 count+=1;
					 c=c/i;	
					 i-=1;
				 }
			 }		
		if(count==1) {
			System.out.print(j+" ");
		}
		count=0;
		 }		
	 }
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력하시오");
		new Sosoo(scanner.nextInt());
	}
}