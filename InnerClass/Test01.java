package InnerClass;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface { 
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	public static void test(MyInterface mi) {
		mi.print();
	}

	public static MyInterface test2() {
		MyInterface mi = new MyInterface() { //익명클래스 생성, 객체는 mi
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}

	public static void main(String[] args) {

		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print(); // MyClass1
		mc2.print(); // MyClass2

		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
		};
		
		//프린트 값은 다 비슷하지만 타입이 다르므로 체크를 잘하자
		test(mc1); // MyClass1, 클래스 타입으로 출력
		test(mi); // 익명 클래스로 구현, 익명클래스 타입으로 출력

		mi.print(); // 익명 클래스로 구현

		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print(); // 선언, 생성, 호출을 한번에 처리

		MyInterface mi2 = test2();
		mi2.print(); // test2() 메서드에서 반환된 MyInterface
	}
}
