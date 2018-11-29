
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int ar[]=new int[m];
		int ar2[]=new int[n];
		
		for(int i=0;i<m;i++)
			ar[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			ar2[i]=sc.nextInt();
		int sum=UserMainCode.getSumOfIntersection(ar,ar2,m,n);
		if(sum!=0)
		System.out.println(sum);
		else
			System.out.println("No common elements");
	}

}