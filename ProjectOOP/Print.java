
class Print {
	public String delimiter = "";	
	public Print(String _delimiter) {
		this.delimiter = delimiter;
	}

	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
//생성자 : 인스턴스에 입력해야 할 초기값을 지정할 수 있게 해줌
// -> 클래스에서 클래스와 같은 이름의 메소드를 정의하면 그것이 생성자로 작동