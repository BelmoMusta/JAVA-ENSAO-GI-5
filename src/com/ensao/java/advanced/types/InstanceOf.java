package com.ensao.java.advanced.types;
@SuppressWarnings("all")
public class InstanceOf {
	public static void main(String[] args) {
		Integer y  = 0;
		//int y  = 0;
		if (y instanceof Object){
			// impossible for primitive types
		}
		
		Integer x = null;
		if(x instanceof Integer){
			// false because 'null' is not instanceof any Class
		}
		
		String s = "hi";
		if(s instanceof CharSequence){
			// true because String implements CharSequence
		}
		
		
		class A {}
		class B extends A{
			void echo(){
				System.out.println("echo");
			}
		}
		
		A a = new B();
		
		if(a instanceof B b){
			b.echo();
		}
		
		
	}
}
