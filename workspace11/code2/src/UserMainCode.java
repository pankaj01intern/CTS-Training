
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
