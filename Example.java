class Test{
	public void instanceMethod(){
		System.out.println("Instance method..");
	}
	public static void staticMethod(){
		System.out.println("static method..");
	}
}	
class Example{
	public static void main(String args[]){
		Test.staticMethod();
		//Test.instanceMethod(); //Illegal
		
		Test t1=new Test();
		t1.instanceMethod();
	}
}
