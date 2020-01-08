import java.util.Calendar;
import java. util.Scanner;

public class D_day {
	int day[] = new int [13];	//day[i]= i월은 몇일까지 있는지를 저장.
	int year, month, dayday;	//오늘 날짜를 저장.
	int c_year,c_month,c_day,cal=1;
	int change=0,num;	//change는 과거의 날까지를 계산할때, num은 yymmdd로 받은 날을 저장.

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
		System.out.println("연 월 일을 두자리씩 끊어서 입력하세요.");
		System.out.print("ex)오늘은 "+(year-2000));
		if(month<10)
			System.out.print("0");
		System.out.println(month+""+dayday+" 입니다.");
		
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
			System.out.println("1~12월 까지만 있습니다. 월을 다시 입력하세요.");
			c_month=scanner.nextInt();
		}
		while(true) {
			if(0<c_day&&c_day<=day[c_month])
				break;
			System.out.println(c_year+"년"+c_month+"월은 1~"+day[c_month]+"일 까지만있습니다 다시 입력하세요.");
			c_day=scanner.nextInt();
		}
		System.out.println("입력한 날짜는"+c_year+"년"+c_month+"월"+c_day+"일");
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
		
		for(int j=year;j<c_year;j++) {	//윤년 계산
			if(j%4==0) 
				cal+=1;
		} 
			while(year!=c_year) {
				for(int i=1;i<day.length;i++)
					cal+=day[i];
				year+=1;
			//19년 3월 13일, 20년 1월1일 
		}
		if(month == c_month) {
				cal+=(c_day-dayday);	//같은년 같은달 일수계산	
			}
		else	{		//같은년 다른달
			cal+=(day[month]-dayday);	//이번달 총 일수에서 오늘 일자를 뺌
			month+=1;				//이번달은 계산했으니 다음달로 넘어감
			while(month!=c_month) {		//입력받은달까지 달의 일수를 더함.
				cal+=day[month];
				month+=1;
				if(month>12) {
					month=1;
					cal-=365;
				}
			}
			cal+=c_day;				//입력받은 달의 일수 계산
		}			
		System.out.println("(오늘은 기준일부터 1일 입니다.)");
		if(change==0 && (cal-1) >0) //change가 0이면 입력한 날짜는 미래
			System.out.println("오늘부터 입력한 날까지는 "+cal+"일 남았습니다.");
		else if(change!=0)			//change가 0이 아니라면 입력한 날짜는 과거.
			System.out.println("입력한 날부터 오늘은"+cal+"일 지났습니다.");
		else if((cal-1) < 0) 
			System.out.println("오늘부터 입력한 날까지는 D"+cal+"입니다.");
		else
			System.out.println("D-Day");			
	}
	
	
	public static void main(String[] args) {

		new D_day();
		
		
	}
}