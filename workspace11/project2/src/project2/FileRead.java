
package project2;


import java.util.*;

public class FileRead{
public static void main(String args[]){
TreeSet<Integer> ts=new
TreeSet<Integer>();
ts.add(1);
ts.add(8);
ts.add(6);
ts.add(4);
SortedSet<Integer> ss=ts.subSet(2, 10);
System.out.println(ss);
ss.add(9);
System.out.println(ts);
System.out.println(ss);
}}