
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println("=== while ===");
		
		int i = 0;
		while(i < 3) {	
			System.out.println(2);
			System.out.println(3);
			// i = i + 1;
			i++;
		}
		
		//몇번반복해! 할때 좋은 코드
		System.out.println("=== for ===");
		// for뒤에 int가 딱 1번 실행되고, 갯수, j=+1이 되면서 코드실행, 갯수의 조건에 맞게 여러번 실행
		for(int j=0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
		}
			
		System.out.println(4);
		

	}

}
