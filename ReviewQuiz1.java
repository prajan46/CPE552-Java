public __class____  ReviewQuiz1 {
	___public__ static void main(_string[]args______) {


	}
}

interface A {
	public void f() _;____
}

___interface_____ B extends A {
  public void g();
}

abstract class______ C implements A {

}

__abstract class______ D implements A {
	public void f() {
		System.out.println("test");
	}
}

__abstract class______ E implements B {
	public void f() {
		System.out.println("test2");
	}
}

__ class_____ F extends E {
	public void g() {
		System.out.println("test3");
	}
}
		
