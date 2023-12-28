package bjavautil;

import java.util.Calendar;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getYear()+1900+"년");	//1900년부터 카운팅
		System.out.println(now.getMonth()+1+"월");	//0부터 시작
		System.out.println(now.getDate()+"일");	//day of month
		System.out.println(now.getDay()+" day of week");	//일요일=0
		System.out.println("1970년 1월 1일 00시를 기준으로 " + now.getTime()/1000 + "초가 지났습니다"); //1970년을 기준. 몇 밀리초가 흘렀는지.
		
											      //초  분  시 일
		Date dayInfo = new Date(now.getTime() + (1000L*60*60*24*365));	//1년이 지난 후. 숫자가 크기 때문에 long 타입으로 변환해야 함
		System.out.println(dayInfo);
		
		System.out.println("-----------------------");
		Calendar cal = Calendar.getInstance();	//new 생성자를 이용하지 않음.
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);	//0부터 시작
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	//hour->오전/오후 몇 시인지.
		
	}
}
