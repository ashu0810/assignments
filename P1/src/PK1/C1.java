package PK1;

import java.util.Scanner;

public class C1 {
	int a;
	int b;
	static int c;
	public void abs(int a, int b){
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		C1 obj=new C1();
		obj.abs(12, 14);
		System.out.println(obj.a);
		int u=88;
		char t;
		t = (char)u;
		System.out.println(t);
		
		float F= 12.5f;
		int i;
		i=(int)F;
		System.out.println(i);
		System.out.println("plz enter value");
		int re;
		Scanner tp=new Scanner(System.in);
	re=tp.nextInt();
	obj.a=tp.nextInt();
	System.out.println("value  " + re);
	System.out.println("value of a  " +obj.a);
	C1.me2();
	C1.c=74;
	System.out.println("value "+c);
	}
	
	public static void me2()
	{
		System.out.println("I Am static");
	}

}

