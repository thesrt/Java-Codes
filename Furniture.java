    //Inheritance -----------

package CipherSchoolCourse;

public class Furniture {
	int width;
	int height;
	
	void display(String item) {
		System.out.println(item +" Width "+width+" Height "+height);
	}
	public static void main(String[] args) {
		
	}
}
class chair extends Furniture{
	void foo() {width=10;height=20;display("Chair");}
}
class Table extends Furniture {
	void foo() {width=30;height=40;display("Table");}
}
class Almira extends Furniture {
	void foo() {width=50;height=60;display("Almira");}
}
