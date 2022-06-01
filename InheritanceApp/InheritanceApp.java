class Cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	//Overloading 너무 과적하다.
	//자바는 같은 이름의 메소드를 여러 개 과적할 수 있음.
	//오버로딩 자체는 상속과는 큰 상관 X
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2)+v3;
	} //sum만 붙여도 상관없지만 명시적으로 this를 붙여줘야한다. (자기자신) 
}
class Cal3 extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
}
	// Overriding 부모 클래스가 가지고 있는 메소드 재정의(덮어쓰기)
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1,v2);
}
	//super : 부모, this : 자기자신 
}
public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2,1,1));
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2,1));
		System.out.println(c3.minus(2,1));
		System.out.println(c3.sum(2,1));
	}

}

class Cal2{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	}
