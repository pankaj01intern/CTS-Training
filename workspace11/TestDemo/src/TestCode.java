import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class TestCode{
 public static void main(String args[]) throws ParseException{
	 
	 String s1="12-09-2012";
	 String s2="21-10-2012";
	 System.out.println(s2.contains("h"));
	 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	 Date d=sdf.parse(s1);
	 Date d2=sdf.parse(s2);
	 
	 Calendar cal=Calendar.getInstance();
	 cal.setTime(d);
	 int months=cal.get(Calendar.MONTH);
	 int years=cal.get(Calendar.YEAR);
	 int date=cal.get(Calendar.DAY_OF_MONTH);
	 
	 cal.setTime(d2);
	 int months2=cal.get(Calendar.MONTH);
	 int years2=cal.get(Calendar.YEAR);
	 int date2=cal.get(Calendar.DAY_OF_MONTH);
	 
	 
	 
	 
	System.out.println(date);
	 


 }}