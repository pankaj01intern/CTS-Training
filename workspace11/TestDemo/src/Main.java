import java.text.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws ParseException {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();/*
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf2=new SimpleDateFormat("EEEEE");
Date d=sdf.parse(s1);
String ss=sdf2.format(d);
System.out.println(ss);
//System.out.println(n);
}}

class UserMainCode {*/
//public static int getMonthDifference(String s1, String s2) throws ParseException {
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
Date d1=sdf.parse(s1);
Date d2=sdf.parse(s2);
Calendar cal=Calendar.getInstance();
cal.setTime(d1);
int months1=cal.get(Calendar.DAY_OF_MONTH); 
int lastDateOfMonth=cal.getActualMaximum(Calendar.DAY_OF_MONTH);//To get maximum date of a given date...
int year1=cal.get(Calendar.YEAR);
long time=cal.getTimeInMillis();
cal.setTime(d2);
int months2=cal.get(Calendar.MONTH);
int year2=cal.get(Calendar.YEAR);
long time2=cal.getTimeInMillis();
System.out.println(lastDateOfMonth);
System.out.println(months1);
//System.out.println(months2);
//2012-02-11System.out.println(year2);
//System.out.println(year2);
//System.out.println((time2-time)/(3600000*24));
//int n=((year2-year1)*12)+(months2-months1);


}
}