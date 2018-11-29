//Constructor demonstrator

 class C1 {

	public C1(int i) {
		System.out.println(i);
	}

	public static void mC1(int x){
		System.out.println("super cls cons " + x);
		
	}
}

class C2 extends C1{
	public C2(){
		this(1399);
		System.out.println("sub cls def cons ");
	}

	public C2(int i) {
		this(21,122);
		System.out.println("sub cls para cons " + i);
	}
	
	public C2(int i,int j){
		super(2122);
		System.out.println(i + " " + j);
	}
	
}
 
public class Use{
	public static void main(String[] args) {
		C2 c2=new C2();
		C1.mC1(199);
	}
}