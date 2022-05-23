import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	
	public static void main(String[] args) throws IOException {
		
		//10000000  //인자(argument)
		PrintToTimes("a", "-");
		System.out.println(twoTimes("a", "-"));
		//10000000
		PrintToTimes("a", "*");
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		//10000000
		PrintToTimes("a", "&");
		//Email.send("piano0902@kakao.com", "two times a", twoTimes("a", "&"));
		PrintToTimes("b", "!");

	}
	
	// "\n" = 줄바꿈 기호  
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
									//매개변수(Parameter)
	public static void PrintToTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
