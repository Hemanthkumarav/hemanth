package instanceOf;

class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1= new B();
		System.out.println(ob1 instanceof A);//t
		System.out.println(ob1 instanceof B);//t
//	System.out.println(ob1 instanceof D); ob1(A) has no is-a with D
B ob2=new B();
System.out.println(ob2 instanceof B);//true
System.out.println(ob2 instanceof A);//true
//System.out.println(ob2 instanceof D);//ob2 (B) has no is awith D
A ob3 = new A();
System.out.println(ob3 instanceof A);//TRUE
System.out.println(ob3 instanceof B);// false
	}

}
