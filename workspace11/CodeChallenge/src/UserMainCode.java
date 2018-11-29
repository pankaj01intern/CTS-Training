
public class UserMainCode {
	
	public static String getStringUsingNthCharater(String s,int n){
		
		char ar[]=s.toCharArray();
		String s2=Character.toString(ar[0]);
		for(int i=n;i<=s.length();i=i+n){
				s2=s2+(Character.toString(ar[i-1]));
			
		}
		
		return s2;
		
		
	}

}
