
public class MyOOP {
	
	public static void main(String[] args) {
		Print p1 = new Print();
		p1.delimiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print();
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
		
	}

/*
 * instance는 Class의 구조를 따서 원하는 상태를 담아낼 수 있도록 객체화하여 사용할 수 있다. 
 * 
 * Class는 본사
 * Instance는 대리점 혹은 본사안의 부서같은 느낌
 * 변경사항이 있을 때 일일이 값을 변경하지 않아도 Class에서 수정하여 Instance에 공통반영하던지,
 * 변경사항에 맞는 새로운 Instance를 만들어 반영 및 작업의 강도를 줄일 수 있다.
 * 
 * Class 처럼 큰 덩어리를 변경하거나 움직이는 것이 아닌,
 * 보다 작은 복제본인 Instance를 만들어서 필요한 작업을 용이하고 빠르게 할 수 있다.
 */
	
/*
 * static은 Class변수.
 * 프로그램 실행 중에 같은 값을 유지해야 하는 곳에는 static
 * 가변적으로 원하는 값을 넣어서 계속 수정되는 곳에는 static을 붙이면 안됨.
 * static은 생성과 동시에 메모리 할당되며 프로그램이 실행되는 중에는 계속 유지
 * instance는 한번 쓰이고나면 가비지 컬렉터에 의해 사라짐 
 * instance 변수가 필요하지 않은 곳에는 static을 선언한다. 프로그램이 우선적으로 탐색하기 때문에 더 빠르게 실행.
 * instance변수는 new라는명령을 통해 생성 및 초기화 되어야만 사용할 수 있다.
 * static은 프로그램 전반에 걸쳐서 동일한 메모리 영역을 사용한다.
 */
}
