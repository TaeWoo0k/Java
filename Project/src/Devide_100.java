import java.util.Calendar;
import java. util.Scanner;

public class Devide_100 {
	int day[] = new int [13];	//day[i]= i월은 몇일까지 있는지를 저장.
	int year, month, dayday;	//오늘 날짜를 저장.
	int c_year,c_month,c_day,cal=1;
	int change=0,num,today;	//change는 과거의 날까지를 계산할때, num은 yymmdd로 받은 날을 저장.

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
		System.out.println("오늘 기준으로 몇 일 후인지 입력하세요.");
		Day(s.nextInt());
	}
	
	public void CalDate() {			
		int h=0;		
		System.out.println("연 월 일을 두자리씩 끊어서 입력하세요.");
		System.out.print("ex)오늘은 "+(year-2000));
		if(month<10)
			System.out.print("0");
		System.out.print(month);
		if(dayday<10)
			System.out.print("0");
		System.out.println(dayday+" 입니다.");
		
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
			System.out.println("1~12월 까지만 있습니다. 월을 다시 입력하세요.");
			c_month=scanner.nextInt();
		}
		while(true) {
			if(c_day<=day[c_month])
				break;
			System.out.println(c_year+"년"+c_month+"월은 "+day[c_month]+"일 까지만있습니다 다시 입력하세요.");
			c_day=scanner.nextInt();
		}
		System.out.println("입력한 날짜는"+c_year+"년"+c_month+"월"+c_day+"일");
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
		System.out.print("오늘 기준으로"+count+"일 후는 "+(c_year-2000));
				if(c_month<10)
					System.out.print("0");
				System.out.print(c_month);
				if(c_day<10)
					System.out.print("0");
				System.out.println(""+c_day+" 입니다.");		
//윤년 +1
	}
	
	public static void main(String[] args) {

		new Devide_100();
		
		//System.out.println("김태욱멍청이똥꾸멍 다가온다!!! 와이파이비번을 찾아 돌아다니는 사나이!!!!!!!멍충찌!!"); rldudnj~~
	}
}