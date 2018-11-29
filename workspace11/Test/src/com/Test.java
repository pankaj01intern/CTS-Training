package com;
class MyThread extends Thread {
 public void run(int a) {
  System.out.println("Important job running in MyThread");
 }
 public void run(String s) {
  System.out.println("String in run");
 }
}
public class Test {
 public static void main(String[] args) {
  MyThread t1=new MyThread();
  t1.start();
 }
}