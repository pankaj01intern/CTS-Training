
public class Test {
public static void main (String[] args) {
         B b = new B();
         C c = new C();
         b = c;
        newPrint(b);
     }
      public static void newPrint(A a){
          a.printName();
      }
}
