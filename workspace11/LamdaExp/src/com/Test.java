package com;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        if(s.equals("Full")) System.out.println("Yes");
        else if(s.equals("Good") || s.equals("Short") || s.equals("Yorker")) System.out.println("No");
        else System.out.println("Invalid Input");
        
    }
    
}