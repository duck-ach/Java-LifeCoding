
public class OutputMethod {
	
	public static String a() {
		//...
		return "a";
	}
	
	public static int one() {
		return 1;
		//...
	}

	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());
	}

}
/* return 뒤의 값이 그 메소드의 실행결과가 된다.
 * return은 Method를 끝낼때도 사용한다. 
 * return은 메소드를 종료하므로 그 뒤의 기능들은 실행되지 않는다.
 * return값이 어떤 Datatype인지 명시해주어야한다. ex) String, int 등
 
 */
