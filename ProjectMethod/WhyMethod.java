
public class WhyMethod {

	
	public static void main(String[] args) {
		
		//10000000  //인자(argument)
		PrintToTimes("a", "-");
		//10000000
		PrintToTimes("a", "*");
		//10000000
		PrintToTimes("a", "&");
		PrintToTimes("b", "!");

	}
									//매개변수(Parameter)
	public static void PrintToTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
