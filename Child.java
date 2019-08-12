package assignment_1;

public class Child extends Parent{
	public void display(){
		System.out.println("I am a Child");
	}
	public static void main(String[] args) {
		new Child().display();
	}
}
