package CipherSchoolCourse;

public class PolyMorphism {
	
	void add(int num1,int num2) 
	{System.out.println(num1+num2);}
	
	void add(int num1,int num2,int num3)
	{System.out.println(num1+num2+num3);}
	
	void add(float num1,float num2)
	{System.out.println(num1+num2);}
	
	void add(int num1,float num2)
	{System.out.println(num1+num2);}
	
	void add(float num1,int num2)
	{System.out.println(num1+num2);}
	
	public static void main(String[] args) {
		
		PolyMorphism p = new PolyMorphism();
		p.add(12.8f, 500);
	}
}
