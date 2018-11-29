import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
     String s=br.readLine();
     int n=Integer.parseInt(br.readLine());
    String s2=UserMainCode.getStringUsingNthCharater(s,n);
     System.out.println(s2);
     
	}

}










public class UserMainCode {
	
	public static int getSumOfIntersection(int ar[],int ar2[],int m,int n){
		int sum=0;
		int i,j;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(ar[i]==ar2[j]){
					sum=sum+ar[i];
					break;
				}
			}
		}
		
		return sum;
	}

}
