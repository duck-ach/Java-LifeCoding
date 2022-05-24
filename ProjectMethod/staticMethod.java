class Print {
	public String delimiter;
	//Static이 없는 (instance소속)
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	//Static이어야함 (Class 소속) 
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}
public class staticMethod {

	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		//t1 = Print의 분신 
		//Print = Class
		//instance
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		Print.c("$");
		
//		Print.a("*");
//		Print.b("*");
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}
}

//Method가 Class 소속일때는 static이 있어야하고,
//Instance 소속일때는 static이 없어야한다.
