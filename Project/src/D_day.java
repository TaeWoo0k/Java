import java.util.Calendar;
import java. util.Scanner;

public class D_day {
	int day[] = new int [13];	//day[i]= i���� ���ϱ��� �ִ����� ����.
	int year, month, dayday;	//���� ��¥�� ����.
	int c_year,c_month,c_day,cal=1;
	int change=0,num;	//change�� ������ �������� ����Ҷ�, num�� yymmdd�� ���� ���� ����.

	public D_day(){
		int day[] = new int [13];
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
		Change();
		Cal();
			}
	
	public void CalDate() {			
		int h=0;		
		System.out.println("�� �� ���� ���ڸ��� ��� �Է��ϼ���.");
		System.out.print("ex)������ "+(year-2000));
		if(month<10)
			System.out.print("0");
		System.out.println(month+""+dayday+" �Դϴ�.");
		
		Scanner scanner = new Scanner(System.in);
				int num = scanner.nextInt();
				this.num = num;
				
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
			if(0<c_day&&c_day<=day[c_month])
				break;
			System.out.println(c_year+"��"+c_month+"���� 1~"+day[c_month]+"�� �������ֽ��ϴ� �ٽ� �Է��ϼ���.");
			c_day=scanner.nextInt();
		}
		System.out.println("�Է��� ��¥��"+c_year+"��"+c_month+"��"+c_day+"��");
		}
	
	public void Change() {
		if(year>c_year) {
			change = c_year; 
			c_year=year;
			year = change;
		
			change = c_month;
			c_month =month;
			month = change;
		
			change = c_day;
			c_day = dayday;
			dayday = change;
		}
		else if(month>c_month) {
			change = c_month;
			c_month =month;
			month = change;
		
			change = c_day;
			c_day = dayday;
			dayday = change;
		}
		else if(dayday>c_day) {
			
			change = c_day;
			c_day = dayday;
			dayday = change;
		}
	}
	public void Cal() {
		
		for(int j=year;j<c_year;j++) {	//���� ���
			if(j%4==0) 
				cal+=1;
		} 
			while(year!=c_year) {
				for(int i=1;i<day.length;i++)
					cal+=day[i];
				year+=1;
			//19�� 3�� 13��, 20�� 1��1�� 
		}
		if(month == c_month) {
				cal+=(c_day-dayday);	//������ ������ �ϼ����	
			}
		else	{		//������ �ٸ���
			cal+=(day[month]-dayday);	//�̹��� �� �ϼ����� ���� ���ڸ� ��
			month+=1;				//�̹����� ��������� �����޷� �Ѿ
			while(month!=c_month) {		//�Է¹����ޱ��� ���� �ϼ��� ����.
				cal+=day[month];
				month+=1;
				if(month>12) {
					month=1;
					cal-=365;
				}
			}
			cal+=c_day;				//�Է¹��� ���� �ϼ� ���
		}			
		System.out.println("(������ �����Ϻ��� 1�� �Դϴ�.)");
		if(change==0 && (cal-1) >0) //change�� 0�̸� �Է��� ��¥�� �̷�
			System.out.println("���ú��� �Է��� �������� "+cal+"�� ���ҽ��ϴ�.");
		else if(change!=0)			//change�� 0�� �ƴ϶�� �Է��� ��¥�� ����.
			System.out.println("�Է��� ������ ������"+cal+"�� �������ϴ�.");
		else if((cal-1) < 0) 
			System.out.println("���ú��� �Է��� �������� D"+cal+"�Դϴ�.");
		else
			System.out.println("D-Day");			
	}
	
	
	public static void main(String[] args) {

		new D_day();
		
		
	}
}