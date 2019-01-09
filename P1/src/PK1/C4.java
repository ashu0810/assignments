package PK1;

public class C4 extends C3 {
	public void D()
	{
		System.out.println("Grandson");
	}
 public static void main(String[] args) {
	C4 te=new C4();
	te.me();
	te.c();
	te.D();
	String am="5487";
	Integer r=Integer.parseInt(am);
	System.out.println(r);
	r=r+10;
	String am1=r.toString();
	System.out.println(am1);
	System.out.println("print");
}
}
