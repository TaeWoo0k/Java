import java.util.Calendar;
import java. util.Scanner;

public class Devide_100 {
	int day[] = new int [13];	//day[i]= i���� ���ϱ��� �ִ����� ����.
	int year, month, dayday;	//���� ��¥�� ����.
	int c_year,c_month,c_day,cal=1;
	int change=0,num,today;	//change�� ������ �������� ����Ҷ�, num�� yymmdd�� ���� ���� ����.

	public Devide_100(){
		int day[] = new int [13];
		Scanner s = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		this.year=c.get(Calendar.YEAR);
		this.month = c.get(Calendar.MONTH)+1;
		this.dayday =  c.get(Calendar.DAY_OF_MONTH);
		for(int i=1; i<day.length; i++) {
			
			if(i%2==0) {
				if(i<8) {
					if(i==2)
						day[i]=28;
					else
						day[i]=30;
				}
				else
					day[i]=31;
			}
			else {
				if(i<8)	
				day[i]=31;
				else
					day[i]=30;					
			}
		}
		for(int i=1; i<day.length;i++) 
			this.day[i]=day[i];
		
		
		CalDate();
		System.out.println("���� �������� �� �� ������ �Է��ϼ���.");
		Day(s.nextInt());
	}
	
	public void CalDate() {			
		int h=0;		
		System.out.println("�� �� ���� ���ڸ��� ��� �Է��ϼ���.");
		System.out.print("ex)������ "+(year-2000));
		if(month<10)
			System.out.print("0");
		System.out.print(month);
		if(dayday<10)
			System.out.print("0");
		System.out.println(dayday+" �Դϴ�.");
		
		Scanner scanner = new Scanner(System.in);
				num = scanner.nextInt();				
					while(true) {
						if(num%100==0) {
							c_day=h;
							break;
						}
						num-=1;
						h+=1;
					}
					num/=100;
					h=0;
					while(true) {
						if(num%100==0) {
							c_month=h;
							break;
						}
						num-=1;
						h+=1;
					}
					h=0;
					num/=100;
					while(true) {
						if(num%100==0) {
							c_year=h+2000;
							break;
						}
						num-=1;
						h+=1;
					}				
		if(c_year%4==0)
			day[2]+=1;
		while(true) {
			if(0<c_month && c_month<=12)
				break;
			System.out.println("1~12�� ������ �ֽ��ϴ�. ���� �ٽ� �Է��ϼ���.");
			c_month=scanner.nextInt();
		}
		while(true) {
			if(c_day<=day[c_month])
				break;
			System.out.println(c_year+"��"+c_month+"���� "+day[c_month]+"�� �������ֽ��ϴ� �ٽ� �Է��ϼ���.");
			c_day=scanner.nextInt();
		}
		System.out.println("�Է��� ��¥��"+c_year+"��"+c_month+"��"+c_day+"��");
		}
	
	
	public void Day(int count) {
		/*c_day=dayday;
		c_month=month;
		c_year=year;*/
		for(int i=1;i<count;i++) {
			if(c_day>=day[c_month]) {
				c_month+=1;
				c_day=0;
			}
			if(c_month==day.length)
			{
				c_month=1;
				c_year+=1;
				c_day-=1;
				
			}
			 		
		//	if(i%100==0)
			System.out.println(c_year+"     "+c_month+"       "+c_day+"    i=  "+i);
			
		}
		System.out.print("���� ��������"+count+"�� �Ĵ� "+(c_year-2000));
				if(c_month<10)
					System.out.print("0");
				System.out.print(c_month);
				if(c_day<10)
					System.out.print("0");
				System.out.println(""+c_day+" �Դϴ�.");		
//���� +1
	}
	
	public static void main(String[] args) {

		new Devide_100();
		
		//System.out.println("���¿��û�̶˲ٸ� �ٰ��´�!!! �������̺���� ã�� ���ƴٴϴ� �糪��!!!!!!!������!!"); rldudnj~~
	}
}