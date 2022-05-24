class Greeting{
	//public, protected, default, private
	public static void hi() {
		System.out.println("Hi");
}
}
	//private는 같은 Class 내부에서만 사용할 수 있다. (내부적)
public class AccessLevelModifiersMethod {
	
	public static void main(String[] args) {
		Greeting.hi();

	}

}
