import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		System.out.println(Math.PI); 
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		System.out.println(Math.round(1.8));
		System.out.println(Math.round(1.4));
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" Java");
		//close = 파일작업 끝났다는 뜻 . 
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java");
		f2.close();
		
		f1.write("!!!");
		f1.close();
	}

}
// instance는 class(변수+메소드의 집합체)를 복사한 후 새로운 이름을 부여하여 선언한 
 