
public class ArrayApp {

	public static void main(String[] args) {
		
		//egoing, jinhuck, heera
		
		//type가 String인 변수
		//String users = "egoing, jinhuck, heera";
		
		//배열
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "heera";
		
		System.out.println(users[2]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
	}

}
